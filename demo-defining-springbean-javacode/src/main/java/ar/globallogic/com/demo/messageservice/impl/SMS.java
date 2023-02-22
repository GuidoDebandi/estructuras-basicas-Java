package ar.globallogic.com.demo.messageservice.impl;

import org.springframework.stereotype.Component;

import ar.globallogic.com.demo.language.Language;
import ar.globallogic.com.demo.messageservice.MessageService;

@Component
public class SMS implements MessageService{

	private Language language;
	
	
	public String getMessage() {
		return " An SMS message" ;
	}

	public String getLanguage() {
		return language.getLanguage();
	}

}
