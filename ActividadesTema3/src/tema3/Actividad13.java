package tema3;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String password;
		int mayusculas;
		int minusculas;
		int numeros;
		int especiales;
		
		do {
			System.out.println("Introduce una contraseña: ");
			password = scanner.next();
			
			mayusculas = 0;
			minusculas = 0;
			numeros = 0;
			especiales = 0;
			
			for(int i=0; i<password.length(); i++) {
				String caracter = password.substring(i, i+1);
				
				if(caracter.matches("[a-z]")) {
					minusculas++;
				}
				else if(caracter.matches("[A-Z]")) {
					mayusculas++;
				}
				else if(caracter.matches("[0-9]")) {
					numeros++;
				}
				else if(caracter.matches("[@#*%&/]")) {
					especiales++;
				}
			}
			
			if(mayusculas >= 2 && minusculas >= 2 && numeros >= 2 && especiales >= 2 && password.length() >= 10) {
				System.out.println("Contraseña válida. ");
			}
			else {
				System.out.println("Contraseña no válida. ");
			}
		}
		while(!(mayusculas >= 2 && minusculas >= 2 && numeros >= 2 && especiales >= 2 && password.length() >= 10));
		
		

	}

}
