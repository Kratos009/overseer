package com.overseer.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.overseer.credentials.CredentialService;
import com.overseer.credentials.UserCredentials;
import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;
import com.overseer.model.requests.UserRegistrationRequest;

@Path("/health")
public class HealthCheckService {

	@Autowired
	private ApplicationContext appContext;

	@GET
	@Path("helloworld")
	@Produces(MediaType.APPLICATION_JSON)
	public UserRegistrationRequest helloWorld() throws PasswordHashGeneratorNotFoundException {
		// PasswordHashGeneratorFactory factory = new
		// DefaultPasswordHashGeneratorFactory();
		// String hashedPasswordString = "";
		// try {
		// PasswordHashGenerator generator =
		// factory.GetPasswordHashCalculator("PBKDF2");
		// SecureRandom sr = new SecureRandom();
		// byte[] rndBytes = new byte[8];
		// sr.nextBytes(rndBytes);
		// byte[] hashedPassword = generator.GeneratePasswordHash("kratos",
		// rndBytes, "SHA256", 20, 56);
		// hashedPasswordString = new String(hashedPassword);
		// } catch (PasswordHashGeneratorNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		CredentialService credentialService = (CredentialService) appContext.getBean("credentialService");
		credentialService.saveNewCredentials("kratos", "kratos");
		UserRegistrationRequest request = new UserRegistrationRequest();
		request.setEmailId("kratos.chaitanya@gmail.com");
		request.setPhoneNumber("9967345953");
		return request;
	}

}
