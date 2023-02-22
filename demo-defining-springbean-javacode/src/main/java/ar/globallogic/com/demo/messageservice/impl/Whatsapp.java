package ar.globallogic.com.demo.messageservice.impl;

import org.springframework.stereotype.Component;

import ar.globallogic.com.demo.language.Language;
import ar.globallogic.com.demo.messageservice.MessageService;


@Component
public class Whatsapp implements MessageService{

	private Language language;
	
	public String getMessage() {
		return "A Whatsapp message";
	}

	public String getLanguage() {
		return language.getLanguage();
	}
	

}
