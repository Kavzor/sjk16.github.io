package com.jensen.spring.mvc.app;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitalizer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context =
				new AnnotationConfigWebApplicationContext();
		context.register(WebConfig.class);
		
		ServletRegistration.Dynamic dispatcher = servletContext.
				addServlet("dispatcher", new DispatcherServlet(context));
		//<servlet> 
		//	<servlet-name>dispatcher</servlet-name>
		//	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		//</servlet>
		
		int LOAD_ON_START = 1;
		dispatcher.setLoadOnStartup(LOAD_ON_START);
		dispatcher.addMapping("/");
		
		
		ServletRegistration.Dynamic facesServlet = servletContext.
				addServlet("faces servlet", new FacesServlet());
		
		facesServlet.setLoadOnStartup(LOAD_ON_START);
		facesServlet.addMapping("*.xhtml");
	}

}
