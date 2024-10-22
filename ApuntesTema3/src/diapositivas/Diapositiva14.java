package diapositivas;

import java.util.Scanner;

public class Diapositiva14 {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		int numero = 0;
		
		do {
			System.out.println("Dime un numero: ");
			numero = sca.nextInt();
		}
		while(numero < 1 || numero > 10);
		
		System.out.println("El " + numero + " está entre 1 y 10");
		
		
	}

}
