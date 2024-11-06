package practicas;

import java.util.Scanner;

public class Diap28 {

	public static void main(String[] args) {
		/*Diseñar un programa que pida al usuario 
		 *un número positivo y lo muestre unidad a 
		 *unidad. Por ejemplo, para el número 123, 
		 *debe mostrar primero el 3, a continuación 
		 *el 2, y por último el 1.
		 */
		Scanner sca = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Dime un número positivo");
			n = sca.nextInt();
			
			
		}
		while(n <= 0);
			for(int i = n;i > 0; i= i/10) {
				int digito = i % 10;
				System.out.printf("%d", digito);
				
			}
	}

}
