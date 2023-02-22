package ar.globallogic.com.demo.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ar.globallogic.com.demo.messageservice.MessageService;

public class SpringApplication {

	public static void main(String [] args) {
		
		
		//Cargo la clase MessageConfig que actuara como archivo applicationContext.xml de spring. 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessageConfig.class);
		
		//Obtengo el bean del Spring container o Spring Factory
		MessageService message = context.getBean("email", MessageService.class);
				
		// Llamo al metood correspondiente al bean que pedi
		System.out.println(message.getMessage());
		
		//Llamo al metodo getLanguages usando inyectado en el bean obtenido de messageService. 
		//Es decir, uso la dependencia del bean
		System.out.println(message.getLanguage());
		
		//Cierro el bean para buenas practicas y recurrencia.
		context.close();
	}
	
}
