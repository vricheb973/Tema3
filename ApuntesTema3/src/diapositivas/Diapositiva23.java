package diapositivas;

import java.util.Scanner;

public class Diapositiva23 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sca.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			System.out.println(i);
		}

	}

}
