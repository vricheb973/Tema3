package practicas;

import java.util.Scanner;

public class EjercicioPrueba {

	public static void main(String[] args) {
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

		

	


