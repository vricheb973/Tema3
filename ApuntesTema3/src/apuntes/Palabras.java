package apuntes;

public class Palabras {

	public static void main(String[] args) {

		//                0123456789
		String palabra = "Viva el Betis";
		
		//Cojo el substring "Betis"
		String caracter1 = palabra.substring(8, 13);
		//Cojo el substring "a"
		String caracter2 = palabra.substring(3,4);
		
		System.out.println(caracter1);
		System.out.println(caracter2);
		
		//Cuando sabemos el número de iteraciones usamos un for
		for(int i=0; i<palabra.length(); i++) {
			String caracter = palabra.substring(i, i+1);

			//Aquí pongo la lógica necesaria del problema
			
		}

	}

}
