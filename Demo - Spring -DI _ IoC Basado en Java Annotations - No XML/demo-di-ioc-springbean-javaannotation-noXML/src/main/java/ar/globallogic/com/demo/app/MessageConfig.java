package ar.globallogic.com.demo.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //Le dice a Spring este es un java configuration y actuaria igual que un application contexto o config file
//Al estar vacio el config file hay uqe agregarle el paquete a escanear, actua de la misma forma que el context:componentScan.
//Por lo que agrego el annotation @ComponentScan con el paquete donde se encuentra mi clase Config a levantar. (MessageConfig en este caso).
@ComponentScan("ar.globallogic.com.demo") 
public class MessageConfig {

}
