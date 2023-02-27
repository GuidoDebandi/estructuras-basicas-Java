package controldeflujo;

import java.util.*;

public class application2 {
	
	public static void main(String[] args) {
	

		
	int ejercicio=5; 		//Variable para indicar el ejercicio a mostrar por pantalla
		
		switch(ejercicio) {
		case 1:
			int a=3,b=0;
			int c = a+b;
			if(c<=10) System.out.println("La suma de numeros es:"+c);
			else System.out.println("La suma de los numeros es mayor a 10");
			
		break;
		
		case 2:
			char letra= 'A';
			if(Character.isUpperCase(letra))System.out.println("Es una letra Mayuscula");
				else System.out.println("No es una letra Mayuscula");
		break;
		
		case 3:
			double compra=400;
			double descuento=0;
			if(compra == 300) {
				descuento=0.2;
				System.out.println("El descuento es de:"+descuento*compra);
			}
				else if(compra >350) {
					descuento=0.25;
					System.out.println("EL descuento es de:"+descuento*compra);
				}
					else {
						descuento =0;
						System.out.println("Sin descuento el total es: "+compra);
					}
		break;
		
		case 4:
			for(int i=0;i<=10;i++) {
			System.out.println("Valor iterado: "+i);
			}
		break;
			
		case 5:	
			int contador=0;
			for(int i=0;i<=10000;i++) {
				if(i%20 == 0) {
					contador++;
				}
				
			}
			System.out.println("La cantidad de numeros divisibles por 20 es: "+ contador);
		break;
			
		case 6:
			List<String> days=new ArrayList<String>();
			days.add("Lunes");
			days.add("Martes");
			days.add("Miercoles");
			days.add("Jueves");
			days.add("Viernes");
			days.add("Sabado");
			days.add("Domingo");
			for(int i=0;i<=6;i++) {
				System.out.println("Dia de la semana: "+ days.get(i));
			}
		break;
			
		case 7:
			int i=1;
			do {
				System.out.println("Valor iterado: "+i);
				i++;
			}while(i<=10);
		break;
			
		case 8:
			int j=1;
			String aux="";
			do {
				
			 aux=(j%2==0)?"Valor iterado "+j+" par." :"Valor iterado "+j+" impar.";
			 System.out.println(aux);
			 j++;
			}while(j<=50);
		break;
			
		case 9:
			Integer[] intArray = new Integer[]{ 1,2,3,4,5,6,7,8,9,10 }; 
			for(Integer k:intArray) {
				System.out.println("Valor iterado: "+ k);
			}
		break;
		
		case 10:
			String[] StringArray= new String[] {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
			for(String day:StringArray) {
				System.out.println("Dia de la semana: "+ day);
			}
		break;
		
		case 11:
			String palabra="Bootcamp 2021";
			char[] letras=new char[13];
			palabra.getChars(0, 13, letras, 0); //Coloco cada caracter del String en la cadena de caracteres letras
			
			for(char letra1:letras) {
				System.out.println(letra1);
			}
		break;	
		
		}
		
		
	}
}
