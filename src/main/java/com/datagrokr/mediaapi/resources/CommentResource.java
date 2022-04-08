package com.datagrokr.mediaapi.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class CommentResource {

	@GET
	public String test() {
		return "test";
	}
	
	@GET
	@Path("/{id}")
	public String getCommentById() {
		return "comment with Id :";
	}
	
}
