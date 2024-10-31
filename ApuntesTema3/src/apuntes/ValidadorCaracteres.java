package apuntes;

import java.util.Scanner;

public class ValidadorCaracteres {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);

		//Validar un solo caracter
 		String caracter;
		do {
			System.out.println("Dime un carácter: ");
			caracter = sca.next();
		} while (caracter.length() != 1);
		
		//Validar una palabra de 6 letras
 		String palabra1;
		do {
			System.out.println("Dime una palabra de exactamente 6 letras: ");
			palabra1 = sca.next();
		} while (palabra1.length() != 6);
		

		//Validar una palabra de 7 o más letras
 		String palabra2;
		do {
			System.out.println("Dime una palabra 7 letras o más: ");
			palabra2 = sca.next();
		} while (palabra2.length() < 7);

	}

}
