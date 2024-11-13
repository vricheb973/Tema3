package practicas;

import java.util.Scanner;

public class OtraVez {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String palabra = sca.next();
		
		for (int i = 0; i < palabra.length(); i++) {
			String letra = palabra.substring(0, i+1);
			System.out.println(letra);
		}
	}

}
