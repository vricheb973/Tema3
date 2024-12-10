package practicas;

import java.util.Scanner;

public class Palotes {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("dime un número");
		int numero = sca.nextInt();
		
		String palote = "";
		
		for(int i =numero;i > 0;i= i/10) {
			int digito = i%10;
			
			for(int j=0;j<digito;j++) {
				palote = "|" + palote;
			}
			if(i >=10) {
				palote = "-" + palote;
			}
		}
		System.out.println(palote);
		
	}

}
