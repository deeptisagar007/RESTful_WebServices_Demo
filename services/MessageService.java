package com.javaBrains.RESTWebService.message.services;

import java.util.HashMap;
import java.util.Map;

import com.javaBrains.RESTWebService.message.messageDataObject.MessageDAO;

public class MessageService {

	public MessageService() {

	}

	private Map<Long, MessageDAO> messageDataBase = new HashMap<>();

	public boolean addMessage(MessageDAO message) {
		MessageDAO result = messageDataBase.put(message.getId(), message);
		if (result == null) {
			return true;
		} else {
			return false;
		}
	}

	public Map<Long, MessageDAO> getAllMessages() {
		Map<Long, MessageDAO> returnAllMessages = messageDataBase;
		return returnAllMessages;
	}

	public MessageDAO getMessage(long id) {
		MessageDAO requestedMessage = messageDataBase.get(id);
		return requestedMessage;
	}

	public void updateMessage(MessageDAO updateMessage) {
		messageDataBase.replace(updateMessage.getId(), updateMessage);
	}

}
