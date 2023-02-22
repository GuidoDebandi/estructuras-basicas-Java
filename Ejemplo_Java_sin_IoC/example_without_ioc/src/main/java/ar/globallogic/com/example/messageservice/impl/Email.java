package ar.globallogic.com.example.messageservice.impl;

import ar.globallogic.com.example.messageservice.MessageService;

public class Email implements MessageService{

	
	@Override
	public String getMessage() {
		return "An email message";
	}
	
}
