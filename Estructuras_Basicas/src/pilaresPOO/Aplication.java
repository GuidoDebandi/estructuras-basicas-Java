package pilaresPOO;

import java.util.*;

public class Aplication {
	public static void main(String[] args) {
		
		
		
		int ejercicio= 2; //Variable para elegir que ejercicio mostrar en pantalla
		
		
		
		
		Heladera heladera = new Heladera("philips",45,'w',"Negro",12,true, 5);
		Electrodomestico electrodomestico= new Electrodomestico("Hitachi",78.2,'H',"Gris");
		Televisor tele = new Televisor ("TCL",25.6,'w',"Negro",42,"1920x1080");
		Cafetera cafetera=new Cafetera("ATMA",1.7,'w',"Blanco",1.5);
		
		switch(ejercicio) {
		
		case 1:		
			System.out.println(heladera.toString());
			System.out.println(electrodomestico.toString());
		break;
		
		case 2:
			List<Electrodomestico> listaElectro=new ArrayList();
			listaElectro.add(heladera);
			listaElectro.add(tele);
			listaElectro.add(cafetera);
			for(Electrodomestico dispositivo:listaElectro) {
				dispositivo.encender();
			}
		break;
		
		case 3:
			Gato gato1=new Gato();
			gato1.setNombre("Milo");
			gato1.setPatas(4);
			
			System.out.println("El gato se llama "+gato1.getNombre()+" y tiene "+gato1.getPatas()+ " patas.");
		break;
		
		case 4:
			Automovil auto=new Berlina();
			
			auto.retoceder();
		break;
		

		}
	}
}
