import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Prueba {
	private Integer suma=0;
	private Integer asumar;
	
	public Prueba() {
		
	}
	
	public  void imprimirPorPantalla(List<String> nombres) {
		
		for(int i=0; i< nombres.size(); i++ ) {
			System.out.println("El nombre del Alumno es " + nombres.get(i));	
			
		}
			
	}
	public void sumaTotal(Set<Integer> conjuntoDeEntero) {
		System.out.println("Conjunto de Enteros a sumar: "+conjuntoDeEntero);
		for (Iterator<Integer> iterator = conjuntoDeEntero.iterator(); iterator.hasNext();) {
			 Integer elemento = iterator.next();
			 
			 asumar = Integer.parseInt(elemento.toString());
			 suma = suma + asumar;
//			 Integer.parseInt(elemento.toString() )+Integer.parseInt(elemento.toString() );
			}
		
		System.out.println("La suma de los enteros es "+suma);
	}

}
