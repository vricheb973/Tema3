package diapositivas;

import java.util.Scanner;

public class Diapositiva31 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		int opcion;
		
		do {
			System.out.println("1. Opción 1.");
			System.out.println("2. Opción 2.");
			System.out.println("3. Opción 3.");
			System.out.println("4. Opción 4.");
			System.out.println("5. Salir.");
			
			opcion = sca.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Ejecutando la opción 1....");
					break;
				case 2:
					System.out.println("Ejecutando la opción 2....");
					break;
				case 3:
					System.out.println("Ejecutando la opción 3....");
					break;
				case 4:
					System.out.println("Ejecutando la opción 4....");
					break;
				default:
					System.out.println("Saliendo....");
			}
			
		}
		while(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
