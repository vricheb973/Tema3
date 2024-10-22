package diapositivas;

import java.util.Scanner;

public class Diapositiva16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		do {
			System.out.println("Dime el primer número: ");
			numero1 = scanner.nextInt();

			System.out.println("Dime el segundo número: ");
			numero2 = scanner.nextInt();
		}
		while(numero1 != numero2);
		
	}

}
