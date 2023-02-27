package estructurasBasicas;

public class Application {
	public static void main(String[] args) {
		Empleado emp=new Empleado();
		emp.setSalario(1000);
		
		System.out.println(emp.getNombre()+" tiene un salario proimedio de: "+emp.getSalario());
	}
}
