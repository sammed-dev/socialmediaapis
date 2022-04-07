package com.datagrokr.mediaapi.resources;

import java.util.ArrayList;
import java.util.List;

import com.datagrokr.mediaapi.model.Message;
import com.datagrokr.mediaapi.services.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Message getMessageById(@PathParam("id") Long id) {
		return messageService.getMessage(id);
	}
	
}
