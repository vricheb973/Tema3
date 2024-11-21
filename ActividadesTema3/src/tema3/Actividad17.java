package tema3;

import java.util.Scanner;

public class Actividad17 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		long numero = sca.nextLong();
		
		int pares = 0;
		int sumaPares = 0;
		
		for(long i=numero; i>0; i=i/10){ 
			int digito = (int) i%10;
			
			if(digito%2 == 0) {
				pares++;
				sumaPares += digito; //sumaPares = sumaPares + digito;
			}
		}
		
		long numero2 = numero;
		while(numero2 > 0) {
			int digito = (int) numero2%10;
			
			if(digito%2 == 0) {
				pares++;
				sumaPares += digito; //sumaPares = sumaPares + digito;
			}
			
			numero2 /= 10; //numero = numero / 10;
		}
		
		
		System.out.printf("%d tiene %d dígitos pares y suman %d \n", numero, pares, sumaPares);
		
		
		
		
		
		
		
		

	}

}
