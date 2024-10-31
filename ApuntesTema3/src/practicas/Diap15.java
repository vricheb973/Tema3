package practicas;

import java.util.Scanner;

public class Diap15 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		String letra = "";
		do {
			System.out.println("Dime una vocal");
			letra = sca.next();
			
		}
		while(!letra.equalsIgnoreCase("A") &&
				!letra.equalsIgnoreCase("E")&&
				!letra.equalsIgnoreCase("I")&&
				!letra.equalsIgnoreCase("O")&&
				!letra.equalsIgnoreCase("U"));
			System.out.println("Es vocal");
				
				
		}
	}


