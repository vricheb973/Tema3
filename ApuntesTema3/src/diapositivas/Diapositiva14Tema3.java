package diapositivas;

import java.util.Scanner;

public class Diapositiva14Tema3 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int numero = 0;
		
		do {
			
			System.out.println("Dime un numero");
			numero = sca.nextInt();
		}
		
			while(numero <= 0 || numero >=11);
		    System.out.println("El " + numero + "  esta entre 1 y 10");
			
	}

}
