package practicas;

import java.util.Scanner;

public class CopiaEjercicioPrueba {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedir la entrada al usuario
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();
        
        // Inicializar el contador
        int i = 0;
        
        // Usar while para mostrar cada letra
        while (i < palabra.length()) {
            // Obtener cada letra usando substring
            String letra = palabra.substring(i, i + 1);
            // Mostrar la letra con su posición (sumamos 1 para que empiece en 1 en lugar de 0)
            System.out.println("Letra " + (i + 1) + ": " + letra);
            // Incrementar el contador
            i++;
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}