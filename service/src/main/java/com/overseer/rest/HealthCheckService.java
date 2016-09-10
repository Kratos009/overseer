package com.overseer.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.overseer.credentials.CredentialService;
import com.overseer.credentials.UserCredentials;
import com.overseer.credentials.exceptions.IncorrectPasswordException;
import com.overseer.credentials.exceptions.NewPasswordSameAsCurrentPasswordException;
import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;
import com.overseer.model.requests.UserRegistrationRequest;

@Path("/health")
public class HealthCheckService {

	@Autowired
	private ApplicationContext appContext;

	@GET
	@Path("helloworld")
	@Produces(MediaType.APPLICATION_JSON)
	public UserRegistrationRequest helloWorld()  {
	
		UserRegistrationRequest request = new UserRegistrationRequest();
		request.setEmailId("kratos.chaitanya@gmail.com");
		request.setPhoneNumber("9967345953");
		return request;
	}

}
