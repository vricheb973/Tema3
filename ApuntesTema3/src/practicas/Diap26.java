package practicas;

import java.util.Scanner;

public class Diap26 {

	public static void main(String[] args) {
		/*Implementar una aplicación que pida al 
		 *usuario un número comprendido entre 1 y 10.
		 *Hay que mostrar la tabla de multiplicar
		 *de dicho número, asegurándose de que el
		 *número introducido se encuentra en el 
		 *rango establecido.
		 */
		Scanner sca = new Scanner(System.in);
		
		int n;
		
		
		do {
			System.out.println("Dime un número del 1 al 10");
			n = sca.nextInt();
		}
			while(n < 1 || n > 10);
			System.out.printf("La tabla del %d \n", n);
			

			for(int i = 1; i <= 10; i++) {
				System.out.printf("%d x %d = %d \n", n, i, (n*i));
				
			}
			
			



	}
}


