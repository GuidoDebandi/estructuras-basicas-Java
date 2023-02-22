package ar.globallogic.com.demo.messageservice.impl;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ar.globallogic.com.demo.language.Language;
import ar.globallogic.com.demo.messageservice.MessageService;


@Component
public class Email implements MessageService{

//	@Autowired
//	@Qualifier("spanish") //se agrega el qualifier por tener varios beans del tipo Language
	/*
	 *Como estoy obteniendo el bean por medio de codigo Java el autowired no lo necesito, como tampoco el qualifier. 
	 *Si se los agrega, tanto al Autowired como al Qualifier, ambos, pisaran la configuracion de la inyeccion del bean 
	 *en la definicion del bean en Email.
	*/ 
	private Language language;
	
	public Email() {}
	
	//Constructor necesario por la inyeccion de dependencia del Bean
	public Email(Language language) {
		this.language = language;
	}
	
	
	public String getMessage() {
		return "An email message";
	}

	//Dependencia
	public String getLanguage() {
		//Usa el bean de Lenguage para obtener el idioma seteado mediante getLanguage
		return language.getLanguage();
	}


	
}
