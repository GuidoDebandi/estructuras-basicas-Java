package ar.globallogic.com.demo.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ar.globallogic.com.demo.language.Language;
import ar.globallogic.com.demo.language.impl.English;
import ar.globallogic.com.demo.language.impl.Spanish;
import ar.globallogic.com.demo.messageservice.MessageService;
import ar.globallogic.com.demo.messageservice.impl.Email;
import ar.globallogic.com.demo.messageservice.impl.Skype;

@Configuration 
public class MessageConfig {
	
	//Defino beans para lenguaje
	
	@Bean
	public Language spanish() //spanish es el id del Bean. Debe ir con la primera letra en minuscula para que Spring
							  //lo reconozca como Bean
	{
		return new Spanish();
	}
	
	@Bean
	public Language english() {
		return new English();
	}
	
	//Defino beans para MessageService e inyecto la dependencia correspondiente para cada uno
	@Bean
	public MessageService email() {
		//Como tenemos la notacion Qualifier en 
		return new Email(spanish()); 
	}
	
	@Bean
	public MessageService skype() {
		return new Skype(english());
	}

}
