package practicas;

import java.util.Scanner;

public class Diap14 {

	public static void main(String[] args) {
	
		Scanner sca = new Scanner(System.in);
		
		int numero = 1;
		do {
			System.out.println("Dime un número");
			numero = sca.nextInt();
		}while(numero <=0 || numero >=10);
			System.out.println("Esta entre 1 y 10");
		}

	}


