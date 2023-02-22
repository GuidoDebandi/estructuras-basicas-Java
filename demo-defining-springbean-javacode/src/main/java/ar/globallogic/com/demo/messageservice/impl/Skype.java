package ar.globallogic.com.demo.messageservice.impl;


import org.springframework.stereotype.Component;

import ar.globallogic.com.demo.language.Language;
import ar.globallogic.com.demo.messageservice.MessageService;


@Component
public class Skype implements MessageService{

	private Language language;
	
	public Skype() {}
	
	public Skype(Language language) {
		this.language = language;
	}
	
	public String getMessage() {
		return "A Skype message";
	}

	public String getLanguage() {
		return language.getLanguage();
	}

}
