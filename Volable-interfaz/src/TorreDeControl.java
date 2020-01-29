import java.util.ArrayList;

public class TorreDeControl {
	ArrayList<Volable> v = new ArrayList<Volable>();
	
	public void vuelenTodos() {
		for(Volable vol:v) {
			vol.Volar();
		}
		
	}
	public void agregarVolador(Volable unVolador) {
		v.add(unVolador);
	}

}
