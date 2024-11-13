package practicas;

import java.util.Scanner;

public class ContadorDeLetras {

	public static void main(String[] args) {
		
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Dime una palabra");
		String palabraOriginal =sca.next();
		
		String palabraSustraida = "";
		int numeroLetra = 0;
		int desde = 0;
		int hasta = 0;
		
		numeroLetra = palabraOriginal.length();
		System.out.println(numeroLetra);
		
		/*System.out.println("Desde donde quieres empezar la nueva palabra?");
		desde = sca.nextInt();
		
		System.out.println("Hasta donde quieres la nueva palabra?");
		hasta = sca.nextInt();
		
		palabraSustraida = palabraOriginal.substring(desde, hasta);
		
		System.out.println(palabraSustraida);
		*/
		
	}

}
