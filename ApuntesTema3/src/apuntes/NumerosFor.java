package apuntes;

public class NumerosFor {

	public static void main(String[] args) {

		int numero = 8954;
		
		System.out.println("Recorriendo el número con FOR: ");
		for(int i=numero; i>0; i=i/10) {
			int digito = i % 10;
			
			System.out.println(digito);
		}
		
		//Este while y el for son equivalentes
		System.out.println("Recorriendo el número con WHILE: ");
		while(numero > 0) {
			int digito = numero % 10;
			
			System.out.println(digito);

			numero = numero / 10;
		}
		
		

		
		
		
		
		
		
	}

}
