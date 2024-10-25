package diapositivas;

import java.util.Scanner;

public class Diapositiva29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un entero positivo: ");
		int numero = sc.nextInt();
		
		int factorial = 1;
		
		while(numero > 0) {
			factorial = factorial * numero;
			numero--;
		}
		
		for(int i=numero; i>0; i--) {
			factorial = factorial * i;
		}
		
		do {
			factorial = factorial * numero;
			numero--;
		}
		while(numero > 0);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
