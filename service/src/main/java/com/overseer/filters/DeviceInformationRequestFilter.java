package com.overseer.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

public class DeviceInformationRequestFilter implements ContainerRequestFilter {

	@Override
	public void filter(ContainerRequestContext context) throws IOException {
		String deviceInfoHeaderValue = context.getHeaders().getFirst("X-Device-Information");
		
	}

}
