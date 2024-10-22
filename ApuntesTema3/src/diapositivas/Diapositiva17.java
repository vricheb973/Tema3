package diapositivas;

import java.util.Scanner;

public class Diapositiva17 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		int cont = 0;
		int suma = 0;
		
		do {
			System.out.println("Dime un número: ");
			int numero = sca.nextInt();
			suma = suma + numero;
			cont++;
		}
		while(cont < 10);
		
		double promedio = suma*1.0 / cont;

		System.out.println("La suma es " + suma);		
		System.out.println("El promedio es " + promedio);
	
	}

}
