package practicas;

import java.util.Scanner;

public class Diap16 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int numero1 = 1;
		int numero2 = 1;
		
		do {
			System.out.println("Dime un número");
			numero1 = sca.nextInt();
			System.out.println("Dime otro Numero");
			numero2 = sca.nextInt();
			
		}
		while(numero1 != numero2);
		System.out.println("Son iguales");
	}

}
