package practicas;

import java.util.Scanner;

public class Diap23 {

	public static void main(String[] args) {
		/*Escribir una aplicación para aprender 
		 *a contar, que pedirá un número n y 
		 *mostrará todos los números del 1 a n.
		 */
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime un número");
		int n = sca.nextInt();
		
		for(int i = 1;i<=n; i++) {
			System.out.println(i);
		}
		

	}

}
