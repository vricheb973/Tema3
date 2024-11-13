package practicas;

import java.util.Scanner;

public class EspaciosBlancos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 0;

		System.out.println("Introduce una frase: ");

		String frase = sc.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			String letra = frase.substring(i, i + 1);

			if (letra.equals(" ")) {

				contador++;

			}

			else if (i == frase.length() - 1) {

				contador++;

			}
		}

		System.out.printf("La frase tiene %d palabras", contador);

	}

}
