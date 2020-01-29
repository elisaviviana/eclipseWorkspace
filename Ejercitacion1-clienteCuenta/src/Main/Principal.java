package Main;
import misClases.Cliente;
import misClases.Cuenta;

public class Principal {

	public static void main(String[] args) {
				
		Cliente Cli1 = new Cliente("Alejandro","Garcia");
		Cliente Cli2 = new Cliente("Pedro","Montenegro");
	
		System.out.println(Cli1.getNombre());
		System.out.println(Cli1.getApellido());
		
		Cli2.getNombre();
		Cli2.getApellido();
		
		Cuenta deAlejandro = new Cuenta(206543,Cli1);
		Cuenta dePedro = new Cuenta(983563, Cli2);
		Cuenta dePedro2 = new Cuenta(0001, Cli2);
		
		deAlejandro.setSaldo(278.36); 
		dePedro.setSaldo(500.20);
		dePedro2.setSaldo(456.78);
		
		
		deAlejandro.deposito(50.00);
		deAlejandro.deposito(60.00);
		deAlejandro.extraccion(100.00);
		deAlejandro.extraccion(500.00);
		
		dePedro.deposito(10.00);
		dePedro.deposito(100.00);
		System.out.println(dePedro.extraccion(700.00));

		dePedro2.deposito(5667.78);
		
		
		
		
	}

}
