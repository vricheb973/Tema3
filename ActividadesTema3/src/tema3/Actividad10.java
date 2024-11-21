package tema3;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime la base: ");
		double base = sca.nextDouble();
		
		int exponente;
		do {
			System.out.println("Dime el exponente: ");
			exponente = sca.nextInt();
		}
		while(exponente <= 0);
		
		double resultado = 1;		
		
		for(int i=0; i<exponente; i++) {
			resultado *= base;
		}
		
		System.out.printf("La potencia es %.2f \n", resultado);

	}

}
