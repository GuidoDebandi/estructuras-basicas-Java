package ar.globallogic.com.example.app;

import ar.globallogic.com.example.messageservice.MessageService;
import ar.globallogic.com.example.messageservice.impl.Email;

public class Application {

	public static void main(String [] args) {
		
		//---> Create the object
		
		MessageService message = new Email();
		//MessageService message = new SMS();
		//MessageService message = new Whatsapp();
		//MessageService message = new Skype();
			
		
		//----> use the object
		System.out.println(message.getMessage());
	}
	
}
