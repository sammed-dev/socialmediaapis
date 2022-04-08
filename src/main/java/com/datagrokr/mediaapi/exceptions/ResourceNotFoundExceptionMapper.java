package com.datagrokr.mediaapi.exceptions;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ResourceNotFoundExceptionMapper implements ExceptionMapper<ResourceNotFound> {

	@Override
	public Response toResponse(ResourceNotFound exception) {
		return Response.status(Status.NOT_FOUND).build();
	}

}
