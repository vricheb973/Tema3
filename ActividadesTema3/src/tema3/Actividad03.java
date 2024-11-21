package tema3;

import java.util.Scanner;

public class Actividad03 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime una cadena: ");
		String cadena = sca.next();
		String cadenaFinal = "";
		
		String caracter1;
		do {
			System.out.println("Dime el primer carácter: ");
			caracter1 = sca.next();
		}
		while(caracter1.length() != 1);
		
		String caracter2;
		do {
			System.out.println("Dime el segundo carácter: ");
			caracter2 = sca.next();
		}
		while(caracter2.length() != 1);
		
		for(int i=0; i<cadena.length(); i++) {
			String letra = cadena.substring(i, i+1);
			
			if(letra.equalsIgnoreCase(caracter1)) {
				cadenaFinal = cadenaFinal + caracter2;
			}
			else {
				cadenaFinal = cadenaFinal + letra;
			}
			
		}
		
		System.out.println(cadenaFinal);
	}

}
