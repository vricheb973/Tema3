package diapositivas;

import java.util.Scanner;

public class Diapositiva10Tema3 {

	public static void main(String[] args) {
		Scanner sca  = new Scanner(System.in);
		
		
		int numero = 1;
		
		
		
		while(numero != 0) {
			System.out.println("Introduce un numero");
			numero = sca.nextInt();
			if(numero %2 ==0) {
				System.out.println("Es par");
			}
				if(numero %2 != 0) {
				System.out.println("Es impar");
				if(numero == 0){
						System.out.println("Se acabo");
			
		}
	}

}
}
}