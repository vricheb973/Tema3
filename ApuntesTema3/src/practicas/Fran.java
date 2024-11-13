package practicas;

public class Fran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		public class CuentaClase {
			//Atributos
			private String numero;
			private double saldo;
			
			//Constructor
			public CuentaClase (String numero, double saldo) {
				
				this.numero=numero;
				this.saldo=saldo;
				
				
			}
			public CuentaClase (String numero) {
				saldo=0.0;
				this.numero=numero;
				
				
			}
			
			public CuentaClase (float saldo) {
				numero="por defecto";
				this.saldo=saldo;
				
				
			}

			//Getters y setters
			public String getNumero() {
				return this.numero;
					
			}
			
			public void setNumero(String numero) {
			
				if(numero.isBlank()) {
					throw new IllegalArgumentException();
					
				}
				else {
					
					
				
					
				this.numero=numero;
				}		
			}
			
			public double getSaldo() {
				return this.saldo;
					
			}
			
			public void setSaldo(double saldo) {
				this.saldo=saldo;
						
			}
			
			public void ingresarDinero(double cantidad){
				
				this.saldo += cantidad;
				
			}
			public void extraerDinero(double cantidad) {
				if(saldo-cantidad<0) {
					throw new ArithmeticException("Saldo en negativo");
				}
				else {
				this.saldo -= cantidad;
				}
			
			}
			
			public void mostrarCuenta() {
				System.out.printf("[Numero de cuenta: %s - Saldo: %.2f €\n", numero, saldo);
				
			}
			
			
		}


	}

}
