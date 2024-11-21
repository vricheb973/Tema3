package tema3;

import java.util.Scanner;

public class Actividad04 {

	public static void main(String[] args) {

		/*
		 * Pide una cadena y dos caracteres por teclado (valida que sea un 
		 * carácter), sustituye la aparición del primer carácter en la 
		 * cadena por el segundo carácter.
		 */
		
		Scanner sca = new Scanner(System.in);
		
		//Solo permito cadenas de 5 caracteres o más
		String cadena;
		do {
			System.out.println("Dime una cadena: ");
			cadena = sca.next();
		}
		while(cadena.length() < 5);

		String caracter1;
		do {
			System.out.println("Dime el primer caracter: ");
			caracter1 = sca.next();
		}
		while(caracter1.length() != 1);


		String caracter2;
		do {
			System.out.println("Dime el segundo caracter: ");
			caracter2 = sca.next();
		}
		while(caracter2.length() != 1);
		
		String aux = "";
		
		for(int i=0; i<cadena.length(); i++) {
			String caracter = cadena.substring(i, i+1);
			
			if(caracter.equals(caracter1)) {
				aux = aux + caracter2;
			}
			else {
				aux = aux + caracter;
			}
		}
		


	}

}
