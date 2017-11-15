package com.socialDemoJSF.model.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;


@SessionScoped
@Named
public class UserManager implements Serializable {
	//Alla scopes som lever kvar i serverns minne och eventuellt
	//ska skrivas till en hårddisk eller liknande måste implmentera
	//serializable.
	//Detta gäller för scopes:en
	// - Session, Conversation, Application och View
	private static final long serialVersionUID = 3893535455247447289L;
	
	private User currentUser;
	
	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	
	public boolean isSignedIn() {
		return currentUser != null;
	}
	
	public String signOut(){
		FacesContext.getCurrentInstance().getExternalContext().
			invalidateSession();
		
		//När en session förstörs så gör den först det efter att 
		//användaren har fått tillbaks sin response.
		//med ?faces-redirect=true tvingar vi användaren att göra ett
		//nytt anrop, dvs. så att användaren inte har kvar
		//de gamla förstörda session:et
		return "index?faces-redirect=true";
	}

	public String SignIn(String username, String password) {
		if(username.equals("adc") && password.equals("123")) {
			currentUser = new User(username);
			return "profile?faces-redirect=true";
		}
		else {
			FacesMessage message = new FacesMessage("Invalid credentials");
			FacesContext context = FacesContext.getCurrentInstance();
			
			context.addMessage(null, message);
			
			return "index";
		}
	}
}
