package practicas;

import java.util.Scanner;

public class Act3 {

	public static void main(String[] args) {
		/*Suponiendo que hemos introducido una 
		 * cadena por teclado que representa 
		 * una frase (palabras separadas por 
		 * espacios), realiza un programa que 
		 * cuente cuantas palabras tiene.
		 */
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime una frase");
		String frase = sca.nextLine();
		
		int contador = 0;
		
		for(int i = 0; i<frase.length(); i++) {
			String palabra = frase.substring(i, i+1);
			
			if(palabra.equals(" ")) {
				contador++;
				
			}else if(i == frase.length() - 1) {
				contador++;
			}
		}
		
		System.out.println(contador);
	}

}
