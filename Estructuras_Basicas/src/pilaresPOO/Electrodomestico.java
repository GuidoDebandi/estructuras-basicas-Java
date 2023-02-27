package pilaresPOO;

public class Electrodomestico {
	protected String marca;
	protected double peso;
	protected char consumo;
	protected String color;
	
	
	
	public Electrodomestico() {
		super();
	}
	
	
	public Electrodomestico(String marca, double peso, char consumo, String color) {
		super();
		this.marca = marca;
		this.peso = peso;
		this.consumo = consumo;
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getConsumo() {
		return consumo;
	}
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void encender() {
		System.out.println("Se encendio el electrodomestico");
	};
	public void apagar() {
		System.out.println("Se apago el electrodomestico");
	}


	@Override
	public String toString() {
		return (" La marca es "+this.getMarca()+".\n" +
				" El peso es "+this.getPeso()+" kg"+".\n" +
				" El consumo se mide en "+this.getConsumo()+".\n" +
				" El color es "+this.getColor()+".\n"
				);
	};
	
	
}
