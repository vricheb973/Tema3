package diapositivas;

import java.util.Scanner;

public class Diapositiva28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		//Valido que el número sea un entero positivo
		do {
			System.out.println("Dime un entero positivo: ");
			numero = sc.nextInt();
		}
		while(numero <= 0);
		
		//Podemos recorrer con un for
		for(int i=numero; i>0; i=i/10) {
			int digito = i % 10;
			System.out.println(digito);
		}
		
		//Podemos recorrer con un while
		while(numero > 0) {
			int digito = numero % 10;
			System.out.println(digito);
			numero /= 10;
		}
		
		//Podemos recorrer con un do-while
		do {
			int digito = numero % 10;
			System.out.println(digito);
			numero /= 10;
		}
		while(numero > 0);
				
	}

}
