package tema3;

import java.util.Scanner;

public class Actividad02 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime una cadena: ");
		String cadena = sca.next();
		
		String caracter;
		do {
			System.out.println("Dime un carácter: ");
			caracter = sca.next();
		}
		while(caracter.length() != 1);
		
		int contador = 0;
		
		for(int i=0; i<cadena.length(); i++) {
			String letra = cadena.substring(i, i+1);
			
			if(letra.equalsIgnoreCase(caracter)) {
				contador++;
			}
		}
		
		System.out.printf("El caracter aparece %d veces \n", contador);
			
			
			
			
			
			
			
			

	}

}
