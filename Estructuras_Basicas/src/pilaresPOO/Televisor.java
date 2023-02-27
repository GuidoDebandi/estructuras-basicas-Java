package pilaresPOO;

public class Televisor extends Electrodomestico{
	private double pulgadas;
	private String resolucion;
	
	

	
	
	public Televisor() {
		super();
	}
	
	public Televisor(double pulgadas, String resolucion) {
		super();
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
	}

	public Televisor(String marca, double peso, char consumo, String color) {
		super(marca, peso, consumo, color);
	}
	public Televisor(String marca, double peso, char consumo, String color, double pulgadas, String resolucion) {
		super(marca, peso, consumo, color);
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
	}
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public void encender() {
		System.out.println("Se enciende el Televisor");
	}
	public void apagar() {
		System.out.println("Se apaga el Televisor");
	}
	
	public void cambiarCanal(int canal) {
		System.out.println("Se ha sintonizado el canal "+canal);
	}

	@Override
	public String toString() {
		System.out.println("El TV cuenta con "+this.getPulgadas()+" pulgadas.");
		System.out.println("La resolucion es: "+this.getResolucion()+".");
		return super.toString();
	}
	
	
	
}
