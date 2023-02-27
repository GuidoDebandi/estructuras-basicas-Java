package clasesobjetos;

public class Empleado extends Persona {
	private int dni;
	private String Nombre;
	private double sueldoBase;
	private int horasExtras;
	private double retenciones;
	private boolean estaCasado;
	private int hijos;
	private static double importeHora;
	
	
	//Ejemplo de Datos
	/*
	 *
			Empleado empl=new Empleado(12345678);
			empl.setNombre("Lucas Guerrero Arjona");
			empl.setEstaCasado(false);
			empl.setSueldoBase(1150.0);
			empl.setHijos(2);
			empl.setHorasExtras(4);
			empl.setRetenciones(15.0);
			
			System.out.println(empl.toString());
	
	 */
	
	
	
	
	
	
	public Empleado() {
		super();
	}
	public Empleado(int dni) {
		super();
		this.dni = dni;
	}
	
		
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getHorasExtras() {
		return horasExtras;
	}
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	public double getRetenciones() {
		return retenciones;
	}
	public void setRetenciones(double retenciones) {
		this.retenciones = retenciones;
	}
	public boolean isEstaCasado() {
		return estaCasado;
	}
	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}
	public int getHijos() {
		return hijos;
	}
	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
	public static double getImporteHora() {
		return importeHora;
	}
	public static void setImporteHora(double importeHora) {
		Empleado.importeHora = importeHora;
	}
	
	
	public double totalHorasExtra() {
		return Empleado.getImporteHora()*this.getHorasExtras();
	}
	
	public double sueldoBruto() {
		return this.totalHorasExtra()+this.getSueldoBase();
	}
	
	public double retencionesIRPF() {
		double retencionesNetas=0;
		double retenciones=this.getRetenciones();
		
		if(this.isEstaCasado()) retenciones= retenciones -2; //decremento 2 puntos si esta casado
		retenciones= retenciones - 1 * this.getHijos(); // decremento 1 punto por cada hijo que tenga el empleado
		
		retencionesNetas=this.sueldoBruto()*retenciones;	
		
		return retencionesNetas;
	}
	
	public double sueldoNeto() {
		return this.sueldoBruto()-(this.sueldoBruto()*this.retencionesIRPF());
	}
	
	@Override
	public String toString() {
		char letraCasado='?';
		if(this.isEstaCasado())letraCasado='S';
		else letraCasado='N';
		return (this.getDni()+"A " + this.getNombre() + "\n" +
				"Sueldo Base: "+ this.getSueldoBase()+ "\n" +
				"Horas Extra: "+ this.getHorasExtras()+ "\n" +
				"tipo IRPF: " + this.getRetenciones()+ "\n" +
				"Casado: "+letraCasado+ "\n" +
				"Número de Hijos: "+ this.getHijos()
				);
	};
	
	
	
}
