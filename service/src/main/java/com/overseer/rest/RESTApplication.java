package com.overseer.rest;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class RESTApplication extends ResourceConfig {

	public RESTApplication() {
		packages("com.overseer.rest");
		register(JacksonFeature.class);
	} 

}
