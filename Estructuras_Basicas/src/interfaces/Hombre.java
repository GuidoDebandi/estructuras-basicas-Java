package interfaces;

public class Hombre implements Persona, Animal{

	@Override
	public void hablar() {
		System.out.println("Las personas hablan mucho");
		
	}

	@Override
	public void dormir() {
		System.out.println("El hombre duerme muchas horas");
		
	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonidos de animal");
		
	}

	@Override
	public void come(String s) {
		System.out.println("Se ejecuta método de la clase" + s );
	}

	

	
}
