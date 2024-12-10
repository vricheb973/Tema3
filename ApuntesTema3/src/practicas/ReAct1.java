package practicas;

import java.util.Scanner;

public class ReAct1 {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		String letra;
	
			do{
				System.out.println("Dime una letra");
				letra = sca.next();
		
			
			if(letra.equalsIgnoreCase("A") ||
			  letra.equalsIgnoreCase("E") ||
			  letra.equalsIgnoreCase("I") ||
			  letra.equalsIgnoreCase("O") ||
			  letra.equalsIgnoreCase("U")) {
			
			System.out.println("Es VOCAL");
			
		}
			else {
				System.out.println("NO es VOCAL");
			}
			}
			
			while(!letra.equals("."));
			System.out.println("EXIT");
			
			
		
		
			
	}

}
