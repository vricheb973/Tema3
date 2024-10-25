package diapositivas;

import java.util.Scanner;

public class Diapositiva28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Dime un entero positivo: ");
			numero = sc.nextInt();
		}
		while(numero <= 0);
		
		while(numero > 0) {
			int digito = numero % 10;
			System.out.println(digito);
			numero = numero / 10;
		}
		
	}

}
