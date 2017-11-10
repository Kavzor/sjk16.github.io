package com.jensen.jsp.tag;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class ClockTag extends SimpleTagSupport {

	//Den ska best�mma ifall vi skriver ut datum
	private boolean showDate;
	
	
	
	public boolean isShowDate() {
		return showDate;
	}



	public void setShowDate(boolean showDate) {
		this.showDate = showDate;
	}



	@Override
	public void doTag() throws JspException, IOException {
		//Den skriver ut inneh�llet i elementet <h1>DENNA TEXT</<h1
		//getJspBody().invoke(null);
		JspWriter out = getJspContext().getOut();
		
		Date date = new Date();
		
		if(showDate) {
			out.write("<p>The date: " + date.toString() + "</p>");
		}
		else {
			out.write("<p>The time: " + date.getTime() + "</p>");
		}
		
	}
}
