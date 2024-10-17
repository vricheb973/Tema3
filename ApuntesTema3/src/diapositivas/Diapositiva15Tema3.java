package diapositivas;

import java.util.Scanner;

public class Diapositiva15Tema3 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		String letra = "";
		
		do {
			System.out.println("Introduce una vocal");
			letra = sca.next();
			
			
		}
		while(!(letra.equalsIgnoreCase("A")||
				letra.equalsIgnoreCase("E")||
				letra.equalsIgnoreCase("I")||
				letra.equalsIgnoreCase("O")||
				letra.equalsIgnoreCase("U")));
			System.out.println("Es una vocal");
	}

}
