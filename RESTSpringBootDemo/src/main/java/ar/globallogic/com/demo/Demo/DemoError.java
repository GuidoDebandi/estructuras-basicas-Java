package ar.globallogic.com.demo.Demo;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false) //No es necesario comparar objetos ni tampoco utilizar algo de la super clase
@Component
public class DemoError extends DemoResponse{

	private String errorCode;
	private String description;
	
}
