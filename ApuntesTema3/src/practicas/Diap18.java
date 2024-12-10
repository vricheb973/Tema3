package practicas;

import java.util.Random;
import java.util.Scanner;

public class Diap18 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		Random random = new Random();
		int aleatorio1;
		int aleatorio2;
		int suma;
		int acierto = 0;
		do {
			aleatorio1 = random.nextInt(100)+1;
			aleatorio2 = random.nextInt(100)+1;
			
			System.out.printf("%d + %d = ", aleatorio1, aleatorio2);
			suma = sca.nextInt();
			if(aleatorio1+aleatorio2 == suma) {
				acierto++;
				System.out.println("Enhorabuena");
			}
		}
		while(aleatorio1+aleatorio2 == suma);
		System.out.printf("Has acertado %d veces",acierto);

	}

}
