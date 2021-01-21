package com.aia.firstspring.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="messages-list") // <message-list></~>가 생김
public class GuestMessageList {
	
	@XmlElement(name="message")
	private List<GuestMessage> message;

	public List<GuestMessage> getMessage() {
		return message;
	}

	public void setMessage(List<GuestMessage> message) {
		this.message = message;
	}

	public GuestMessageList() {
		
	}
	public GuestMessageList(List<GuestMessage> message) {
	
		this.message = message;
	}
	
	
	
}
