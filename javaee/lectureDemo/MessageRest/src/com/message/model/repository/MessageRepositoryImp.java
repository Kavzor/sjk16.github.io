package com.message.model.repository;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.message.model.Message;

//@ApplicationScoped
public class MessageRepositoryImp implements MessageRepository {

	@Override
	public List<Message> findAll() {
		//SELECT * FROM...
		List<Message> messages = new ArrayList<>();
		
		Message message = new Message();
		message.setTopic("Sterotype");
		message.setMessageText("Hello World");
		message.setMessageId(123);
		
		messages.add(message);
		
		//message.setMessageText("NOT hello world");
		
		message = new Message();
		message.setTopic("Another topic");
		message.setMessageText("Another text");
		message.setMessageId(12);
		
		messages.add(message);
		
		return messages;
	}

	@Override
	public Message find(int messageId) {
		//SELECT topic, message, id FROM .... WHERE id = ...
		Message message = new Message();
		message.setTopic("Sterotype in find");
		message.setMessageText("Hello world in find");
		message.setMessageId(messageId);
		
		return message;
	}

	@Override
	public Message update(Message message) {
		//UPDATE ... SET ... WHERE ..
		return message;
	}

	@Override
	public void replace(Message message) {
		//INSERT INTO ...
		System.out.println("CREATED NEW ENTRY: " 
		+ message.getTopic());
	}

	@Override
	public void remove(int messageId) {
		//DELETE FROM ...
		System.out.println("REMOVED ENTRY: " 
		+ messageId);
	}

}
