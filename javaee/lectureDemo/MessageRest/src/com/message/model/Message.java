package com.message.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

//detta ingår i JAXB som används för att göra om java POJO's till xml 
@XmlRootElement
public class Message {

	//object.topic
	private String topic;
	private String messageText;
	private int messageId;
	
	public String getTopic() {
		return topic;
	}
	
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public String getMessageText() {
		return messageText;
	}
	
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	
	@XmlAttribute(name = "id")
	public int getMessageId() {
		return messageId;
	}
	
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	@Override
	public String toString() {
		return "Message [topic=" + topic + ", messageText=" + messageText + ", messageId=" + messageId + "]";
	}
	
	
	
	
}
