package com.jensen.spring.mvc.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration //en fil där bönor defineras explicit
//Som vår resourceViewResolver

@EnableWebMvc //Tillåter oss att mappa controllers mot en vis url

@ComponentScan({"com.jensen.spring.mvc.model"})
//Den hjälper med spring Dep. Injection
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
