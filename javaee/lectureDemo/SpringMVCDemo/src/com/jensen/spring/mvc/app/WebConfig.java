package com.jensen.spring.mvc.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration //en fil d�r b�nor defineras explicit
//Som v�r resourceViewResolver

@EnableWebMvc //Till�ter oss att mappa controllers mot en vis url

@ComponentScan({"com.jensen.spring.mvc.model"})
//Den hj�lper med spring Dep. Injection
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = 
				new InternalResourceViewResolver();
		
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".xhtml");
		
		return resolver;
	}
}
