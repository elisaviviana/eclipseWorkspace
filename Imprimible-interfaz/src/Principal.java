
public class Principal {

	public static void main(String[] args) {
			  Contrato c = new Contrato();
			  Documento d = new Documento();
			  Foto f = new Foto();
			  
			  Impresora imp = new Impresora();
			  
			  imp.imprimirTodo();
			  
			  imp.agregarImprimible(c);
			  imp.agregarImprimible(d);
			  imp.agregarImprimible(f);
			  
			  imp.imprimirTodo();
			  
	}

}
