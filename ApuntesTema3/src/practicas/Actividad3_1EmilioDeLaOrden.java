package practicas;

import java.util.Scanner;

public class Actividad3_1EmilioDeLaOrden {

	public static void main(String[] args) {
		
		/*Realizar un programa que lea una cadena
		 *por teclado y convierta las mayúsculas 
		 *a minúsculas y viceversa.
		 */

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		
		String cadena = sca.next();
		
		StringBuilder resultado = new StringBuilder();
		
		for(int i = 0;i < cadena.length();i++) {
			char letra = cadena.charAt(i);
			
			if(Character.isUpperCase(letra)) {
				resultado.append(Character.toLowerCase(letra));
				
			}
			else if(Character.isLowerCase(letra)) {
				resultado.append(Character.toUpperCase(letra));
			}
			else {
				resultado.append(letra);
				
			}
		}
		System.out.println(resultado);
		

	}

}
