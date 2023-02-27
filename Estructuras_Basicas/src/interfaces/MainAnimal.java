package interfaces;

public class MainAnimal {
	public static void main(String[] args) {
		Perro dog=new Perro();
		int ejercicio = 1;
		switch(ejercicio) {
		case 1:
			dog.sonidoAnimal();
			dog.dormir();
		case 2:
			Animal.camina("perro");
			dog.come("perro");
		break;
		
		case 3:
			Hombre man = new Hombre();
			man.dormir();
			man.hablar();
			man.sonidoAnimal();
			man.come("hombre");
		break;
		}
	}
}
