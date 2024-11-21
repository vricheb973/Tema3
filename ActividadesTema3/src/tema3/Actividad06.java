package tema3;

import java.util.Scanner;

public class Actividad06 {

	public static void main(String[] args) {
		
		//RECONOCER 
		//SOMOS
		//ACURRUCA
		//RADAR
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime una palabra: ");
		String palabra = sca.next();
		
		String palabraReves = "";
		
		// P A P A S
		// 0 1 2 3 4
		
		for(int i=palabra.length()-1; i>=0; i--) {
			String caracter = palabra.substring(i,i+1);
			
			palabraReves = palabraReves + caracter;
		}
		
//		for(int i=0; i<palabra.length(); i++) {
//			String caracter = palabra.substring(i,i+1);
//			
//			palabraReves = caracter + palabraReves;
//		}
		
		if(palabra.equalsIgnoreCase(palabraReves)) {
			System.out.println("Es un palíndromo. ");
		}
		else {
			System.out.println("No es un palíndromo. ");
		}
		
		
		
		
		
		
		
		
		

	}

}
