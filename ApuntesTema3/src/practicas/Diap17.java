package practicas;

import java.util.Scanner;

public class Diap17 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int numero = 1;
		int suma = 0;
		int contador = 0;
		do {
			System.out.println("DIme un número");
			numero = sca.nextInt();
			suma = suma + numero;
			contador++;
		}
		while(contador != 10);
			System.out.println("La suma es " + suma );
			System.out.println("Y la media aritmética es " + suma*1.0 /10);
	}

}
