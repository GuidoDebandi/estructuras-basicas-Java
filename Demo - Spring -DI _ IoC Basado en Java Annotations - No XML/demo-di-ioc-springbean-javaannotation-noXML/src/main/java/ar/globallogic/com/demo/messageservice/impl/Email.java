package ar.globallogic.com.demo.messageservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ar.globallogic.com.demo.language.Language;
import ar.globallogic.com.demo.messageservice.MessageService;


@Component
// @Scope("singleton") Scope del bean, por default singleton por lo que no se agrega. 
public class Email implements MessageService{

	//Defino campo privado del tipo de la dependencia que quiero inyectar.

	
	/*
	 * Realiza el autowiring por constructor. Busca en el paquete escaneado por compnent si hay alguna interfaz
	* o clase que sea del tipo Language y lo inyecta al constructor por defecto, de esta forma trae todas las dependencias 
	* para ser inyectadas en Email cuando se obtiene el Bean.
			* NOTA: --->  A partir de Spring 4.3 no es necesario utilizar Autowired, en este caso en los constructores,
			* a menos que se tengan varios  la misma dependencia, aqui si es obligatorio decirle a Spring cual utilizar para realizar la inyeccion de dependencia
			* En este caso, como tenemos un solo constructor el Autowired es opcional y funciona igual. A fines practicos se agrego 
			* para que el tema sea mas visible y entendible.
	*/ 
	
	@Autowired
	@Qualifier("english")
	private Language language;
	
	
	
	public String getMessage() {
		return "An email message";
	}

	//Dependencia
	public String getLanguage() {
		//Usa el bean de Lenguage para obtener el idioma seteado mediante getLanguage
		return language.getLanguage();
	}


	
}
