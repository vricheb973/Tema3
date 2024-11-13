package practicas;

import java.util.Scanner;

public class PruebaPalote {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sca.nextInt();
		
		String palotes = "";
		
		for(int i=numero; i>0; i=i/10) {
			int digito = i%10;
			
			for(int j=0; j<digito; j++) {
				palotes = "|" + palotes;
			}
			if(i>=10) {
				palotes = "-" + palotes;
			}
		}
		
		System.out.println(palotes);
		

	}

}