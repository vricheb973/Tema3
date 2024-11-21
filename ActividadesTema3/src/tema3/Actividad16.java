package tema3;

import java.util.Random;

public class Actividad16 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int aleatorio = rand.nextInt(100000000, 1000000000);
		
		int golesFrancia = 0;
		int golesInglaterra = 0;
		int golesMbappe = 0;

		System.out.printf("Numero generado: %d \n", aleatorio);
		
		for(int i=aleatorio; i>0; i=i/10) {
			int digito = i % 10;
			
			if(digito % 2 == 0) {
				golesFrancia++;
				
				if(digito % 4 == 0) {
					golesMbappe++;
				}
			}
			else {
				golesInglaterra++;
			}
		}
		

		System.out.printf("FRANCIA %d - %d INGLATERRA \n", golesFrancia, golesInglaterra);
		System.out.printf("Goles de Mbappé: %d \n", golesMbappe);
		
		
		
		
				

	}

}
