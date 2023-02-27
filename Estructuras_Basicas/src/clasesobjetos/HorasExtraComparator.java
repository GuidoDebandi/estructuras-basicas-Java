package clasesobjetos;

import java.util.Comparator;

public class HorasExtraComparator implements Comparator<Empleado> {

	@Override
	public int compare(Empleado e1, Empleado e2) {
		Double horasExtra[] =new Double[2];
		horasExtra[0]=e1.totalHorasExtra();
		horasExtra[1]=e2.totalHorasExtra();
		
		if( horasExtra[0] == horasExtra[1] )	
			return 0;
		else if(horasExtra[0] > horasExtra[1]) 
				return 1;
			else
				return -1;
	}
}
	