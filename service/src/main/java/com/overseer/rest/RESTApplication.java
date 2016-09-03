package com.overseer.rest;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RESTApplication extends Application {
	  @Override
	    public Set<Class<?>> getClasses() {
	        final Set<Class<?>> classes = new HashSet<Class<?>>();
	        // register root resource
	        classes.add(HealthCheckService.class);
	        return classes;
	    }
}
