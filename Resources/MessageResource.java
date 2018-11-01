package com.javaBrains.RESTWebService.message.Resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javaBrains.RESTWebService.message.messageDataObject.MessageDAO;
import com.javaBrains.RESTWebService.message.services.MessageService;

@Path("/messages")
public class MessageResource {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<MessageDAO> getMessage() {

		MessageService messageService = new MessageService();
		List<MessageDAO> messageList = (List) messageService.getMessage(1);
		return messageList;

	}

}
