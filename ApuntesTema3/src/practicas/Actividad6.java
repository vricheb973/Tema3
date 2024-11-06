package practicas;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		/*Introducir una cadena de caracteres e 
		 *indicar si es un palíndromo. Una palabra 
		 *palíndroma es aquella que se lee igual
		 *adelante que atrás.
		 */
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime una palabra y te diré si es un palíndromo");
		String palabra = sca.next().toLowerCase();
		
		String palindromo = "";
		char reves;
		
		for(int i = palabra.length() -1;i >= 0; i--) {
			reves = palabra.charAt(i);
			
			palindromo = palindromo + reves;
		}
			
			if(palabra.equals(palindromo)) {
				System.out.println("La palabra " + palindromo + " es un palíndromo");
			}
			else {
				System.out.println("No es un palíndromo");
			}
			
		
		


	}

}
