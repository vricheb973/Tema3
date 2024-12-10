package practicas;

import java.util.Scanner;

public class Actividad3_2 {

	public static void main(String[] args) {
		/*Realiza un programa que vaya pidiendo 
		 * números positivos hasta que se introduzca 
		 * un cero y nos diga cuantos números se han 
		 * introducido, la media de los impares y el 
		 * mayor de los pares. El cero sólo se utiliza 
		 * para indicar el final de la introducción 
		 * de datos pero no se incluye en el cómputo.
		 */
		Scanner sca = new Scanner (System.in);
		
		int contador = 0;
		int contImpar = 0;
		int suma = 0;
		int media = 0;
		int par = Integer.MIN_VALUE;
		int num;
		do {
			System.out.println("Introduce un número positivo. Introduce un 0 para terminar");
			num = sca.nextInt();
			
				if(num > 0) {
					contador++;
					
					if (num %2 == 1 ) {
						media += num;
						contImpar++;
					}
				
					else if(num %2 == 0){
						if(num > par) {
							par = num;
						}
					}
				}
					else if(num < 0){
								System.out.println("Introduce un número positivo, por favor");
						
					}
				
			}
		while (num != 0);
		     System.out.printf("El total de numeros es: %d\n",contador);
		     System.out.printf("La media de los numros impares es: %.2f \n", media * 1.0 / contImpar);
		        if(par != Integer.MIN_VALUE) {
		    	  System.out.printf("El mayor de los números pares es: %d \n",par);	  
		       }else{
		    	  System.out.println("No has introducido ningún número par");
		      }
		    	  
		
	}
}


