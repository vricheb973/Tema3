package diapositivas;

import java.util.Scanner;

public class Diapositiva9Tema3 {

	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		int cont = 0;
		int suma = 0;
		while(cont < 10) {
			System.out.println("Dime un numero");
			int numero = sca.nextInt();
			suma = suma + numero;
		
		 cont++;
		
		}
			System.out.println("la suma es " + suma);
			System.out.println("La media es " + suma*1.0 /cont);
	}

}
