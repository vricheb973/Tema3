package tema3;

import java.util.Scanner;

public class Actividad07 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("¿Cuántos números vas a introducir?");
		int cantidad = sca.nextInt();
		
		int mayores = 0;
		int menores = 0;
		int iguales = 0;
		
		for(int i=0; i<cantidad; i++) {
			System.out.printf("Dime el numero %d \n", i+1);
			int numero = sca.nextInt();
			
			if(numero > 0) {
				mayores++;
			}
			else if(numero < 0) {
				menores++;
			}
			else {
				iguales++;
			}
		}

		System.out.printf("Mayores que cero: %d \n", mayores);
		System.out.printf("Menores que cero: %d \n", menores);
		System.out.printf("Iguales que cero: %d \n", iguales);

	}

}
