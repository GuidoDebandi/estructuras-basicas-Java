package coverage.loteria;

import config.Generated;
import coverage.loteria.model.CartonGenerator;


public class Loteria {
	private float pozo;
	private int boletos;
	private int ganadores;
	private CartonGenerator cartonGenerator;
	
	
	public Loteria(float pozo, int boletos, CartonGenerator cartonGenerator) {
		this.pozo = pozo;
		this.boletos = boletos;
		this.cartonGenerator = cartonGenerator;
		this.ganadores = 0;
	}

	@Generated
	public float getPozo() {
		return pozo;
	}
	
	@Generated
	public int getBoletos() {
		return boletos;
	}
	
	@Generated
	public int getGanadores() {
		return ganadores;
	}
	
	

	public void jugada()
	{
		for(int i=0;i<boletos;i++)
		{
			if(cartonGenerator.isGanador()) {
				this.ganadores++;
			}
		}
	}
	
	public boolean hayGanadorUnico()
	{
		if(this.getGanadores() == 1)
			return true;
		else 
			return false;
	}
	
	public boolean hayCuadrupleGanador()
	{
		if(this.getGanadores() == 4)
			return true;
		else 
			return false;
	}			
}
