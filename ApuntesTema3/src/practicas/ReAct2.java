package practicas;

import java.util.Scanner;

public class ReAct2 {

	public static void main(String[] args) {
		
		System.out.println("Dime una cadena");
		Scanner sca = new Scanner(System.in);
		
		String cadena = sca.next();
		
		String caracter ="";
		boolean esValido = false;
		while(!esValido) {
			System.out.println("Dime una letra");
			String validador = sca.next();
			
			if(validador.length() ==1) {
				caracter = validador;
				esValido = true;
		
			}
			else {
				System.out.printf("Una sola letra",validador);
			}
				}
		
			int contador = 0;
			
			for(int i = 0; i<cadena.length();i++) {
				if(cadena.substring(i, i+1).equals(caracter)) {
				contador++;
			}
			}			
				System.out.printf("El %s se repite %d veces" , caracter, contador);
	
	}
	
		
	}

