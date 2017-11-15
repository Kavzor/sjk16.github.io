package demo.DPI;

public class UserService {
	
	private User user;
	
	public UserService(User user) {
		this.user = user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public void login() {
		user.login();
	}
	
	public void logout() {
		user.logout();
	}

}
