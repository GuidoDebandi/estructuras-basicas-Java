package coverage.example;

import coverage.example.model.Galaxy;

public class Application {
    
    void mostrarEnPantalla() {
           
        System.out.println("Esto es una prueba");
        System.out.println("Mostrando la galaxia:"+ new Galaxy("Via Lactea").name);
    }

	public static void main(String[] args) {
	    
	    new Application().mostrarEnPantalla();
	}

}
