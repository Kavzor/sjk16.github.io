package com.message.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;


@Provider
public class ResponseFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext request,
			ContainerResponseContext response) throws IOException {
		
		System.out.println("Running filter..");
		response.getHeaders().
			add("Access-Control-Allow-Origin", "*");
		
		response.getHeaders().
			add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
		response.getHeaders().
			add("Access-Control-Allow-Headers", "Content-Type");
	}
}
