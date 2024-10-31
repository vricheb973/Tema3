package apuntes;

public class Numeros {

	public static void main(String[] args) {

		int numero = 8954;
		int numero2 = numero;
		int numPares = 0;
		
		while(numero > 0) {
			int digito = numero % 10;
			
			//Aquí va la lógica concreta del ejercicio
			if(digito % 2 == 0) {
				numPares++;
			}
			
			// numero /= 10;
			numero = numero / 10;
		}
		
		System.out.printf("El número %d tiene %d dígitos pares \n", numero2, numPares);

	}

}
