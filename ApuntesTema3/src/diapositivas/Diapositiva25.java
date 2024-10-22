package diapositivas;

import java.util.Scanner;

public class Diapositiva25 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		double suma = 0.0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Dime un número: ");
			int numero = sca.nextInt();
			
			suma += numero;
		}
		
		System.out.printf("La media es %.2f \n", (suma/10));

	}

}
