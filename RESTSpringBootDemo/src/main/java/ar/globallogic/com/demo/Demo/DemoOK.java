package ar.globallogic.com.demo.Demo;

import org.springframework.stereotype.Component;


import lombok.Data;
import lombok.EqualsAndHashCode;



@Data
@EqualsAndHashCode(callSuper=false) //No es necesario comparacion de objetos o utilizar hashcode ni utilizar los de su super clase
@Component
public class DemoOK extends DemoResponse {

	private String id;
	
	private String nombre;
	
}
