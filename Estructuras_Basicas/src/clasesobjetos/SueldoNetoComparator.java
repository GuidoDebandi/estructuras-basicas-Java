package clasesobjetos;

import java.util.Comparator;

public class SueldoNetoComparator implements Comparator<Empleado> {

	@Override
	public int compare(Empleado e1, Empleado e2) {

		
		if( e1.sueldoNeto() == e2.sueldoNeto() )	
			return 0;
		else if(e1.sueldoNeto() > e2.sueldoNeto() ) 
				return 1;
			else
				return -1;
	}
	
}
