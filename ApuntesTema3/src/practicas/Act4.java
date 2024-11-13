package practicas;

import java.util.Scanner;

public class Act4 {

	public static void main(String[] args) {
		/*Pide una cadena y dos caracteres por teclado (valida que sea un carácter), 
		 * sustituye la aparición del primer carácter en la cadena por el segundo carácter.
		 */
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String palabra = sca.next();
		
		System.out.println("Ahora dime una letra");
		String letra1 = sca.next();
		
		System.out.println("y ahora dime otra letra");
		String letra2 = sca.next();
		
		while(letra1.length() != 1 && letra2.length() != 1);
		
			for(int i = 0; i< palabra.length(); i++) {
				String cambiador = palabra.substring(i, i+1);
				if(cambiador.equals(letra1)) {
					cambiador = letra2;
					
				}
				System.out.printf("La palabra ahora es %s \n",cambiador);
			}
				
			
		
	}

}
