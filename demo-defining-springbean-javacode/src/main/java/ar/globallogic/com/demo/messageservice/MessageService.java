package ar.globallogic.com.demo.messageservice;

public interface MessageService {

	String getMessage();
	
	//Agrego implementacion dependiente, en este caso, depende de Language. Para que cuando se obtenga el bean se obtenga
	//tanto el tipo de servicio de mensajeria y tambien inyecte el idioma que se utilizara.
	String getLanguage();
	
}
