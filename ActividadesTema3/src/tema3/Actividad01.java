package tema3;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		String caracter = "";
		
		do {
			System.out.println("Dime una letra: ");
			caracter = sca.next();
			
			if(caracter.equalsIgnoreCase("A") || 
					caracter.equalsIgnoreCase("E") || 
					caracter.equalsIgnoreCase("I") || 
					caracter.equalsIgnoreCase("O") || 
					caracter.equalsIgnoreCase("U")) {
				
				System.out.println("Es vocal");
			}
			else if(caracter.equalsIgnoreCase(".")) {
				System.out.println("Saliendo...");
			}
			else {
				System.out.println("No es vocal");
			}
		}
		while(!caracter.equals("."));
		

	}

}
