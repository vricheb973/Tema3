package diapositivas;

import java.util.Scanner;

public class Diapositiva09 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		int cont = 0;
		int suma = 0;
		
		while(cont < 10) {
			System.out.println("Dime un número: ");
			int numero = sca.nextInt();
			
			suma = suma + numero;
			
			cont++;
		}

		System.out.println("La suma es " + suma);
		
		double promedio = suma*1.0 / cont;
		
		System.out.println("El promedio es " + promedio);

	}

}
