package excepciones;

public class PropiaClaseExcepcion {
	public void tirarExcep() throws MiExcepcion{
		MiExcepcion exc= new MiExcepcion();
		throw exc;
	}
}
