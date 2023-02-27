package estructurasBasicas;

public class Empleado {
	private static String nombre="Alex";
	private static double salario;
	
	
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Empleado.nombre = nombre;
	}
	public static Double getSalario() {
		return salario;
	}
	public static void setSalario(double salario) {
		Empleado.salario = salario;
	}
	
}
