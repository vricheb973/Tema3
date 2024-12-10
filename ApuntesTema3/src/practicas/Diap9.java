package practicas;

import java.util.Scanner;

public class Diap9 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int suma = 0;
		int contador = 0;
		
		while(contador <=10) {
			System.out.println("Dime un numero");
			int numero = sca.nextInt();
			
			suma = suma + numero;
			contador++;
		}
			System.out.println("La suma de los 10 número es " + suma );
			System.out.println("Y la media aritmètica es " + suma*1.0 /10);
	}

}
