package practicas;

import java.util.Scanner;

public class Act1 {

	public static void main(String[] args) {
		/*Algoritmo que pida caracteres e imprima 
		 * 'VOCAL' si son vocales y 'NO VOCAL' en 
		 * caso contrario, el programa termina 
		 * cuando se introduce un punto.
		 */
		Scanner sca = new Scanner(System.in);
		
		String letra;
		
		do {
			System.out.println("Dime una letra");
			letra = sca.next();
		
		
			if(letra.equalsIgnoreCase("A") || 
			   letra.equalsIgnoreCase("E") || 
			   letra.equalsIgnoreCase("I") || 
			   letra.equalsIgnoreCase("O") || 
			   letra.equalsIgnoreCase("U")) {
			System.out.printf("La %s es vocal \n", letra);
			
	}
			else {
		System.out.printf("La %s es consanante \n",letra);

			}
	}
		while(letra != ".");
			System.out.println("EXIT");
		}
	}

	
	

