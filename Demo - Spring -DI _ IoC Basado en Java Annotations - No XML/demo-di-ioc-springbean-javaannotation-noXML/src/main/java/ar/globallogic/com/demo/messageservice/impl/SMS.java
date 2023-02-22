package ar.globallogic.com.demo.messageservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ar.globallogic.com.demo.language.Language;
import ar.globallogic.com.demo.messageservice.MessageService;

@Component
public class SMS implements MessageService{
	
	@Qualifier("spanish")
	@Autowired
	private Language language;
	
	
	public String getMessage() {
		return " An SMS message" ;
	}

	public String getLanguage() {
		return language.getLanguage();
	}

}
