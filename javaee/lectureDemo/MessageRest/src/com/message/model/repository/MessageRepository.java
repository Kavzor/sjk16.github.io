package com.message.model.repository;

import java.util.List;

import com.message.model.Message;

public interface MessageRepository {
	
	//GET
	public List<Message> findAll();
	
	//GET
	public Message find(int messageId);
	
	//POST
	public Message update(Message message);

	//PUT
	public void replace(Message message);
	
	//DELETE
	public void remove(int messageId);
	
}
