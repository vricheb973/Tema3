package practicas;

import java.util.Scanner;

public class Diap101 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		int numero = 1;
		
		while(numero !=0){
			System.out.println("Dime un número");
			numero = sca.nextInt();
				if(numero %2 == 1) {
					System.out.println("Es impar");
					
				}
			
		}

	}

}
