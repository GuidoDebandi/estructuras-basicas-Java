package interfaces;

public interface Persona {
	public abstract void hablar();
	public abstract void dormir();
	
	
	public default void come(String s) {
		System.out.println("El" + " come");
	}
}
