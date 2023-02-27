package pilaresPOO;

public class Cafetera extends Electrodomestico{
	private double litros;

	
	

	
	
	public Cafetera() {
		super();
	}

	
	public Cafetera(double litros) {
		super();
		this.litros = litros;
	}


	public Cafetera(String marca, double peso, char consumo, String color) {
		super(marca, peso, consumo, color);
	}

	public Cafetera(String marca, double peso, char consumo, String color, double litros) {
		super(marca, peso, consumo, color);
		this.litros = litros;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}
	
	
	
	public void encender() {
		System.out.println("Se enciende la Cafetera");
	}
	public void apagar() {
		System.out.println("Se apaga la Cafetera");
	}
	
	public void elegirSabor(String sabor) {
		System.out.println("Se ha elegido el sabor "+sabor);
	}


	@Override
	public String toString() {
		System.out.println("La cafetera tiene "+this.getLitros()+" litros .");
		return super.toString();
	}
	
	
}
