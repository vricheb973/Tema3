package tema3;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero;
		int buenaSuerte = 0;
		int malaSuerte = 0;
		
		//Valido que el número sea un entero positivo
		do {
			System.out.println("Dime un entero positivo: ");
			numero = sc.nextInt();
		}
		while(numero <= 0);
		
		int numero1 = numero;
		
		while(numero > 0) {
			int digito = numero % 10;
			
			//Buena suerte
			if(digito == 3 || digito == 7 || digito == 8 || digito == 9) {
				buenaSuerte++;
			}
			else {
				malaSuerte++;
			}
			
			switch(digito) {
				case 3:
				case 7:
				case 8:
				case 9:
					buenaSuerte++;
					break;
				default:
					malaSuerte++;
			}
			
			numero = numero / 10;
		}
		
		if(buenaSuerte > malaSuerte) {
			System.out.printf("El %d es un numero afortunado", numero1);
		}
		else {
			System.out.printf("El %d no es un numero afortunado", numero1);
		}

	}

}
