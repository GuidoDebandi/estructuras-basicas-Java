package ar.globallogic.com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.globallogic.com.demo.Demo.DemoOK;
import ar.globallogic.com.demo.Demo.DemoResponse;
import ar.globallogic.com.demo.Demo.DemoError;


/*
 * @RequestMapping ---> Permite definir el basepath 
 * @RestController ---> tiene integrado, @Configuration, @Component, @EnableAutoConfigurator.
 * 						La clase que posee esta annotation Spring la reconoce como Rest, la cual tiene ventajas como 
 * 						serializar y deserializar objetos para poder armar request y responder en json 
 * 						o xml a partir de un objet dado como en GET /foo
 * 						Permite trabajar de forma facil con los verbos Rest
 */

@RequestMapping("/demo")
@RestController 
public class DemoController {

	
	@Autowired
	private DemoOK response;
	
	@Autowired
	private DemoError responseError;
	
	
	//GetMapping ---> Todos los request que lleguen con el verbo GET y el recurso /foo lo tomara esta operacion y devolvera como respuesta un json
	//del objeto Demo. (ResponseEntity es una de las formas de responder un objeto json y ademas permite responder estados del recurso
	//OK, bad request, etc
	@GetMapping(path = "/foo", produces = "application/json")
	public ResponseEntity<DemoOK> getFoo() {
		
		response.setId("123");
		response.setNombre("foo-bar");
		
		//Responde el codigo correspondiente http - ok y su respuesta deserializada al json correspondiente.
		return ResponseEntity.ok(response);
	}

	
	
	//RequestParam permite obtener de la url el query param llamado bar y se le puede decir si es obligatorio o no.
	//El PathVariable permite obtener el path param de la url
	//El ResponseEntity es del tipo DemoResponse que puede ser OK o Error dependiendo la situacion
	@GetMapping("/foo/{foo_id}")
	public ResponseEntity<DemoResponse> getFoo(@PathVariable String foo_id,
												@RequestParam(value = "bar", required = true) String bar ) {
		
		if(bar.equals("z")){
			//Devuelve un error con la entidad Demo Error
			responseError.setErrorCode("-1");
			responseError.setDescription("bar field is invalid");
			return ResponseEntity.badRequest().body(responseError);
		}
		
		response.setId(foo_id);
		response.setNombre(bar);
		
		//Otra forma de responder un ok con el codigo http implicito 200 similar al caso anterior y devuelve la entidad demo
		return ResponseEntity.status(200).body(response);
		}
	 
	
	
	@GetMapping("/bar/{bar_id}")
	public String getBar(@PathVariable String bar_id) {
		
		//Implicitamente se responde un 200
		return "Responding bar with id = " + bar_id; 
		}
	
	

	
	//PostMapping ---> Todos los request que lleguen con el verbo POST y el recurso /foo y tenga un body con el header conten type
	//application/json sera interceptado por spring para que lo tome esta operacion. 
	//RequestBody permite obtener el body del rquest
	@PostMapping(path = "/foo", consumes = "application/json")
	public ResponseEntity<String> createFoo(@RequestBody DemoOK request) {
		
		//Se responde un 201 - creted 
		return ResponseEntity.created(null).body("Resource was created!") ;
	}
	
	
	
	
	//PutMapping ---> Todos los request que lleguen con el verbo PUT y el recurso /foo y tenga un body con el header conten type
	//application/json sera interceptado por spring para que lo tome esta operacion. 
	//RequestBody permite obtener el body del rquest
	@PutMapping(path = "/foo/{foo_id}", consumes = "application/json")
	public String updateFoo(@PathVariable String foo_id, @RequestBody String request) {
		
		//implicitamente se responde un 200
		return "Resource was updated!";
	}
	
	
	
	
	
	//PatchMapping ---> Todos los request que lleguen con el verbo PATCH y el recurso /foo y tenga un body con el header conten type
	//application/json sera interceptado por spring para que lo tome esta operacion. 
	//RequestBody permite obtener el body del rquest
	@PatchMapping(path = "/foo/{foo_id}", consumes = "application/json")
	public ResponseEntity<String> partialUpdateFoo(@PathVariable String foo_id, @RequestBody String request) {
		
		if(foo_id.equals("y")) {
			return ResponseEntity.badRequest().body("The field foo_id is invalid!");
		}
		
		return ResponseEntity.ok("Resource was partially updated!");
	}
	
	
	
	
	
	//DeletehMapping ---> Todos los request que lleguen con el verbo DELETE y el recurso /foo y tenga un body con el header conten type
	//application/json sera interceptado por spring para que lo tome esta operacion. 
	//RequestBody permite obtener el body del rquest
	@DeleteMapping("/foo/{foo_id}")
	public String deleteFoo(@PathVariable String foo_id){
		return "Resource was deleted!";
	}
	
}
