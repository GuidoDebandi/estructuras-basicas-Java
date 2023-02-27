package excepciones;

public class Application {
	public static void main(String[] args) {
		int ejercicio= 4;
		
		switch(ejercicio) {
		case 1:
			System.out.println("Se va a entrar en el bloque try");
			try {
				throw new NullPointerException ("Se creo una excepcion personalizada");
				
						
			}catch(NullPointerException e){
				System.out.println(e.getMessage()+" y se capturo en el bloque catch");
			}finally {
				System.out.println("Esto se ejecuta sin importart si se presentan errores");
			}
					
			System.out.println("Esto no se ejecuta si se presenta un error");
		break;
		
		case 2:
			try {
				String palabra =null;
				palabra.charAt(4);	
			}catch(NullPointerException e) {
				System.out.println("Se produjo una excepcion de NullPointer."+e.getMessage());
			}
			
		break;
		
		case 3:
			try {
				Integer[] nums=new Integer[4];
				nums[4].equals(3);
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Excepción: índice de array fuera de límites");
			}
		break;
		
		case 4:
			try {
				PropiaClaseExcepcion exc=new PropiaClaseExcepcion();
				exc.tirarExcep();
			}catch(MiExcepcion e){
				System.out.println(e.getReferencia());
			}
			
		break;
		}
	}
}
