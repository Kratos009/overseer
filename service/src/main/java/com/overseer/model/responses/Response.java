package com.overseer.model.responses;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class Response<T> {

	private final int responseCode;
	private final Date executedDateTime;
	private final String message;
	private T response;

	public Response(final int responseCode, final String message, final Date executedDateTime) {
		this.responseCode = responseCode;
		this.message = message;
		this.executedDateTime = executedDateTime == null ? Date.from(ZonedDateTime.now(ZoneOffset.UTC).toInstant())
				: executedDateTime;
	}

	public T getResponse() {
		return response;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public Date getExecutedDateTime() {
		return executedDateTime;
	}

	public String getMessage() {
		return message;
	}

	public void setResponse(T response) {
		this.response = response;
	}

}
