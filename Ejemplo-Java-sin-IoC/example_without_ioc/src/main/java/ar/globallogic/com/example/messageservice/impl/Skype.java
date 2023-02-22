package ar.globallogic.com.example.messageservice.impl;

import ar.globallogic.com.example.messageservice.MessageService;

public class Skype implements MessageService{

	@Override
	public String getMessage() {
		return "A Skype message";
	}

}
