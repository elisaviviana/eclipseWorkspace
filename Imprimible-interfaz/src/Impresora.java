
import java.util.ArrayList;


public class Impresora {
	
	ArrayList<Imprimible> objImprimible = new ArrayList<>();
	
	public ArrayList<Imprimible> getObjImprimible(){
		return objImprimible;
	}
	public void setObjImprimible(Imprimible obj) {
		this.objImprimible.add(obj);
	}
	
	public void imprimirTodo() {
		for( Imprimible i: objImprimible ) {
			i.imprimir() ;	
		}
	}
	public void agregarImprimible (Imprimible unImprimible) {
		objImprimible.add(unImprimible);
	}
	

}
