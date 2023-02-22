package ar.globallogic.com.example.messageservice.impl;

import ar.globallogic.com.example.messageservice.MessageService;

public class Whatsapp implements MessageService{

	@Override
	public String getMessage() {
		return "A Whatsapp message";
	}
	

}
