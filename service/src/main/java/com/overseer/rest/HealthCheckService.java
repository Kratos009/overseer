package com.overseer.rest;

import java.security.SecureRandom;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.overseer.lib.DefaultPasswordHashGeneratorFactory;
import com.overseer.lib.PasswordHashGenerator;
import com.overseer.lib.PasswordHashGeneratorFactory;
import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

@Path("/health")
public class HealthCheckService {
	
	@GET
	public String helloWorld() {
//        PasswordHashGeneratorFactory factory = new DefaultPasswordHashGeneratorFactory();
//        String hashedPasswordString = "";
//        try {
//			PasswordHashGenerator generator = factory.GetPasswordHashCalculator("PBKDF2");
//			SecureRandom sr = new SecureRandom();
//			byte[] rndBytes = new byte[8];
//			sr.nextBytes(rndBytes);
//			byte[] hashedPassword = generator.GeneratePasswordHash("kratos", rndBytes, "SHA256", 20, 56);
//		    hashedPasswordString = new String(hashedPassword);
//		} catch (PasswordHashGeneratorNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        
		return "Hello Kratos! How are you!";
	}

}
