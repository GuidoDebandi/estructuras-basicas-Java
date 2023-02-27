package excepciones;

public class MiExcepcion extends Exception{
	private final String referencia="Se lanzo excepcion personalizada";
	
	public String getReferencia() {
		return this.referencia;
	}
}
