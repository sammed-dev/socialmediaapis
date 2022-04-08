package com.datagrokr.mediaapi.exceptions;

import com.datagrokr.mediaapi.model.ErrorMessage;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ResourceNotFoundExceptionMapper implements ExceptionMapper<ResourceNotFound> {

	@Override
	public Response toResponse(ResourceNotFound exception) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), 404L,"www.javabrains.com"); 
		return Response.status(Status.NOT_FOUND)
				.entity(errorMessage)
				.build();
	}

}
