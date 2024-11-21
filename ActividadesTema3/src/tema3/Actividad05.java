package tema3;

import java.util.Scanner;

public class Actividad05 {

	public static void main(String[] args) {

		/*
		 * Realizar un programa que lea una cadena por teclado y 
		 * convierta las mayúsculas a minúsculas y viceversa.
		 */
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime una cadena: ");
		String cadena = sca.next();
		
		String aux = "";
		
		for(int i=0; i<cadena.length(); i++) {
			String caracter = cadena.substring(i,i+1);
			
			if(caracter.equals(caracter.toUpperCase())) {
				aux = aux + caracter.toLowerCase();
			}
			else {
				aux = aux + caracter.toUpperCase();
			}
		}
		
		System.out.println("La cadena resultante: " + aux);

	}

}
