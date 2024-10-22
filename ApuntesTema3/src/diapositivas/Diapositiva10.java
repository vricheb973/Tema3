package diapositivas;

import java.util.Scanner;

public class Diapositiva10 {

	public static void main(String[] args) {
	
		Scanner sca = new Scanner(System.in);
		
		int numero = 1;
		
		while(numero != 0) {
			System.out.println("Dime un número");
			numero = sca.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println("El " + numero + " es par");
			}
		}
	
	}

}
