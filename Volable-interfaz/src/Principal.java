
public class Principal {

	public static void main(String[] args) {

			Pato p = new Pato(10);
			Avion a = new Avion();
			Superman s = new Superman();
			
			TorreDeControl t = new TorreDeControl();
					
			t.agregarVolador(p);
			t.agregarVolador(a);
			t.agregarVolador(s);
			
			t.vuelenTodos();
			t.vuelenTodos();
	}

}
