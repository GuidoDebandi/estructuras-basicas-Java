package ar.globallogic.com.demo.messageservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ar.globallogic.com.demo.language.Language;
import ar.globallogic.com.demo.messageservice.MessageService;


@Component
@Scope("prototype") //Scope bean prototype
public class Skype implements MessageService{

	@Autowired
	@Qualifier("english")
	private Language language;
	

	
	public String getMessage() {
		return "A Skype message";
	}

	public String getLanguage() {
		return language.getLanguage();
	}

}
