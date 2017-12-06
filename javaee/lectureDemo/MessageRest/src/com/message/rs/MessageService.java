package com.message.rs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.message.model.Message;
import com.message.model.repository.MessageRepository;
import com.message.model.repository.MessageRepositoryImp;

//localhost:8080/MessageRest/message-service
@Path("message-service")
public class MessageService {
	
	//@Inject
	private static MessageRepository messageRepository = new MessageRepositoryImp();
	
	//localhost:8080/MessageRest/message-service/messages
	@GET
	@Path("messages")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Message> getAll(){
		return messageRepository.findAll();
	}
	
	//localhost:8080/MessageRest/message-service/messages/13
	@GET
	@Path("messages/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Message get(@PathParam("id") int messageId) {
		return messageRepository.find(messageId);
	}
	
	@POST
	@Path("messages/message")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Message update(Message message) {
		System.out.println(message);
		return messageRepository.update(message);
	}
	
	@PUT
	@Path("messages/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response replace(@PathParam("id") int messageId,
			Message message) {
		message.setMessageId(messageId);
		messageRepository.replace(message);
		
		return Response.status(200).entity(message).build();
	}
	
	@DELETE
	@Path("messages/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response delete(@PathParam("id") int messageId) {
		messageRepository.remove(messageId);
		
		return Response.ok().build();
	}
}










