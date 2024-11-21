package tema3;

public class Actividad11 {

	public static void main(String[] args) {
		
		int pago = 10;
		int total = 0;

		for(int i=0; i<20; i++) {
			System.out.printf("El mes %d se paga %d € \n", i+1, pago);
			total += pago;
			pago *= 2;
		}

		System.out.printf("TOTAL PAGADO: %d € \n", total);
		
		
	}

}
