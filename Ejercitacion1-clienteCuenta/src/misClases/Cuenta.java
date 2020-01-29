package misClases;

public class Cuenta {
	
	private Integer numeroDeCuenta;
	private Double saldo;
	private Cliente titular;
	
	//Setters and Getters
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}	
	
	//Contructor
	public Cuenta() {
		
	}
	public Cuenta(Integer nCuenta, Cliente cli) {
		this.numeroDeCuenta = nCuenta;
		this.titular=cli;
	}
	
	//metodos
	public Double deposito (Double monto) {
		this.saldo = this.saldo + monto;
		 System.out.println("Se realizó un depósito en la cuenta "+this.numeroDeCuenta+" por " +monto+", el saldo de la cuenta es " +this.saldo);
		 return this.saldo;
	}
	
	public Double extraccion (Double montoextr) {
		if(montoextr < this.saldo) {
			this.saldo = this.saldo - montoextr;
			 System.out.println("Se realizó una extracción "
			+this.numeroDeCuenta+" por " +montoextr
			+", el saldo de la cuenta es " + this.saldo);
		}else {
			 System.out.println("Saldo insuficiente");
		}
		return this.saldo;
	}

	
	
	
	
	

}
