package pilaresPOO;

public class Gato {
	
	private String nombre;
    private int patas;
    
    
    public Gato() {
		super();
	}
	public Gato(String nombre, int patas) {
		super();
		this.nombre = nombre;
		this.patas = patas;
	}
	public String getNombre(){ return nombre;}
    public int getPatas(){ return patas;}
    public void setNombre(String nuevoNombre){ nombre = nuevoNombre;}
    public void setPatas(int numeroPatas){ patas = numeroPatas;}

}
