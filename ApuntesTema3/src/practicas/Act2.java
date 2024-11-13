package practicas;

import java.util.Scanner;

public class Act2 {

	public static void main(String[] args) {
		
		System.out.println("Dime una cadena de letras");
		Scanner sca = new Scanner(System.in);
		String cadena = sca.next();
		
		String caracter = "";
		boolean esValido = false;
		
		while(!esValido) {
			System.out.println("Introduce un caracter");
			String 	validador = sca.next();
			
				if(validador.length() == 1) {
					caracter = validador;
					esValido = true;
				}
				else {
					System.out.println("Un solo carcater, por favor");
				}		
		}
		int contador = 0;
		for(int i = 0; i< cadena.length();i++) {
			if(cadena.substring(i, i+1).equals(caracter)) {
				contador++;
			}	
		}	
		System.out.printf("La letra %s aparece %d veces \n",caracter , contador);
	}
}


