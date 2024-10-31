package practicas;

import java.util.Scanner;

public class EjercicioPrueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();
        
        // String para almacenar la palabra invertida
        String palabraInvertida = "";

        // Bucle para recorrer la cadena desde el último carácter hasta el primero
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i); // Añadir el carácter al nuevo String
        }

        System.out.println("Palabra invertida: " + palabraInvertida);
		
		}

	}


