package practicas;

import java.util.Scanner;

public class Diap25 {

	public static void main(String[] args) {
		/*Pedir diez números enteros por 
		 *teclado y mostrar la media.
		 */
		Scanner sca = new Scanner(System.in);
		
		
		double media = 0;
		
		for(int i = 0; i< 10;i++) {
			System.out.println("Introduce un numero");
				int numero = sca.nextInt();
				media = media + numero;
		}
		System.out.println("La media es " + (media / 10));

	}

}
