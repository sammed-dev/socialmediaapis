package com.datagrokr.mediaapi.resources;

import java.util.ArrayList;
import java.util.List;

import com.datagrokr.mediaapi.model.Message;
import com.datagrokr.mediaapi.services.MessageService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(@QueryParam("author") String author) {
		if(author !=null)
			return messageService.getAllMessagesByAuthor(author);
		return messageService.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/page")
	public List<Message> paginateMessages(@QueryParam("start") Long start, @QueryParam("size") Long size){
		return messageService.getMessagesPaginate(start,size);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Message getMessageById(@PathParam("id") Long id) {
		return messageService.getMessage(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addmessage")
	public Response postMessage(Message message) {
		Message message2 =  messageService.addMessage(message);
		return Response.status(Status.CREATED)
				.entity(message2)
				.build();
//		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/update/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("id") Long id, Message message ) {
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	
	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("id") Long id) {
		messageService.deleteMessage(id);
	}
	
	
	@Path("/{id}/comments")
	public CommentResource getComment() {
		return new CommentResource();
	}
	
}
