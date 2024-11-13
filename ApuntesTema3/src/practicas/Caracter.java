package practicas;

import java.util.Scanner;

public class Caracter {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
         System.out.print("Introduce una cadena de texto: ");
         String texto = sca.next();
         
         
         
         for(int i = 0; i < texto.length(); i++) {
        	 String letra = texto.substring(0, i +1);
        	 System.out.println(letra);
         }
    }
}