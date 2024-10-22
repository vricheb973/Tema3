package diapositivas;

import java.util.Scanner;

public class Diapositiva26 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("Dime un numero del 1 al 10");
			n = sca.nextInt();
		}
		while(n < 1 || n > 10); 
		
		System.out.println("Tabla del " + n);
		for(int i=1; i<=10; i++) {
			System.out.printf("%d X %d = %d \n", n, i, n*i);
		}

	}

}
