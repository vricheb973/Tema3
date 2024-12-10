package practicas;

import java.util.Scanner;

public class CopiaEjercicioPrueba {
    public static void main(String[] args) {
    	 Scanner sca = new Scanner(System.in);

         int contador = 0;
         int contImpar = 0;
         int sumaImpares = 0;
         int mayorPar = Integer.MIN_VALUE;
         int num;  // Declarar num aquí, fuera del bloque do

         do {
             System.out.println("Introduce un número positivo. Introduce un 0 para terminar");
             num = sca.nextInt();

             if (num > 0) {
                 contador++;

                 if (num % 2 == 1) { // Número impar
                     sumaImpares += num;
                     contImpar++;
                 } else if (num % 2 == 0) { // Número par
                     if (num > mayorPar) {
                         mayorPar = num;
                     }
                 }
             } else if (num < 0) {
                 System.out.println("Introduce un número positivo, por favor");
             }
         } while (num != 0);

         // Cálculos finales
         double mediaImpares = (contImpar > 0) ? (double) sumaImpares / contImpar : 0;

         // Resultados
         System.out.printf("El total de números es: %d%n", contador);
         System.out.printf("La media de los números impares es: %.2f%n", mediaImpares);
         
         if (mayorPar != Integer.MIN_VALUE) {
             System.out.printf("El mayor de los números pares es: %d%n", mayorPar);
         } else {
             System.out.println("No se introdujeron números pares.");
         }
     }
 }