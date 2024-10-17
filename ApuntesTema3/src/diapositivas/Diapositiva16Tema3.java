package diapositivas;

import java.util.Scanner;

public class Diapositiva16Tema3 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		do {
			System.out.println("introduce un numero");
			a = sca.nextInt();
			System.out.println("introduce otro numero");
			b = sca.nextInt();
			
		}
		while(a != b);
		System.out.printf("El numero %d es igual al numero %d", a, b);
		
				
	}

}
