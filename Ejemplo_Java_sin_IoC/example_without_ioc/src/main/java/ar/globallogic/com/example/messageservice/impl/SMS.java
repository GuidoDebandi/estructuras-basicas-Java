package ar.globallogic.com.example.messageservice.impl;

import ar.globallogic.com.example.messageservice.MessageService;

public class SMS implements MessageService{

	@Override
	public String getMessage() {
		return " An SMS message" ;
	}

}
