package pilaresPOO;

public class Heladera extends Electrodomestico{
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
	
	public Heladera() {
		super();
	}

	public Heladera(double capacidad, boolean tieneFreezer, double capacidadFreezer) {
		super();
		this.capacidad = capacidad;
		this.tieneFreezer = tieneFreezer;
		this.capacidadFreezer = capacidadFreezer;
	}

	public Heladera(String marca, double peso, char consumo, String color) {
		super(marca, peso, consumo, color);
	}

	public Heladera(String marca, double peso, char consumo, String color, double capacidad, boolean tieneFreezer,
			double capacidadFreezer) {
		super(marca, peso, consumo, color);
		this.capacidad = capacidad;
		this.tieneFreezer = tieneFreezer;
		this.capacidadFreezer = capacidadFreezer;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isTieneFreezer() {
		return tieneFreezer;
	}

	public void setTieneFreezer(boolean tieneFreezer) {
		this.tieneFreezer = tieneFreezer;
	}

	public double getCapacidadFreezer() {
		return capacidadFreezer;
	}

	public void setCapacidadFreezer(double capacidadFreezer) {
		this.capacidadFreezer = capacidadFreezer;
	}

	public void guardarElemento(String elemento) {
		System.out.println("Se agrego el elemento "+elemento+" a la heladera");
	}
	
	public void extraerElemento(String elemento) {
		System.out.println("Se extrajo el elemento "+elemento+" de la heladera");
	}
	public void encender() {
		System.out.println("Se enciende la Heladera");
	}
	public void apagar() {
		System.out.println("Se apaga la Heladera");
	}

	@Override
	public String toString() {
		System.out.println(" La heladera tiene "+this.getCapacidad()+" de capacidad");
		if(this.isTieneFreezer())System.out.println(" La heladera tiene freezer y su capacidad es de: "+this.getCapacidadFreezer());
		else System.out.println(" La heladera no tiene freezer");

		return super.toString();
	}
	
	

}
