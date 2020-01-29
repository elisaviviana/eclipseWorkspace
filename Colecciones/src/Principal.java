import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class Principal {

	public static void main(String[] args) {
		
		System.out.println("\n---------Ejercicio 3---------------------------------------");
		System.out.println("Definir e inicializar una nueva lista vacía. Agregar a la lista vacía los siguientes elementos: 1,5,5,6,7,8,8,8.\n" + 
				"Imprimir el resultado por pantalla.\n");
		
		//List
			List<Integer> lista = new ArrayList<Integer>();
			lista.add(1);
			lista.add(5);
			lista.add(5);
			lista.add(6);
			lista.add(7);
			lista.add(8);
			lista.add(8);
			lista.add(8);
			
		System.out.println(lista);
		System.out.println("La List permite repetir elementos");
		System.out.println("\n---------Ejercicio 4---------------------------------------");
		System.out.println("Definir e inicializar un nuevo conjunto vacío. Agregar al conjunto vacío los siguientes elementos: 1,5,5,6,7,8,8,8.\n" + 
				"Imprimir el resultado por pantalla. ¿Qué diferencia existe con el ejercicio anterior?\n");

		//HashSet
		HashSet<Integer> conjunto = new HashSet<Integer>();
		conjunto.add(1);
		conjunto.add(5);
		conjunto.add(5);
		conjunto.add(6);
		conjunto.add(7);
		conjunto.add(8);
		conjunto.add(8);
		conjunto.add(8);
		
		System.out.println(conjunto);
		System.out.println("El HashSet no repite los elementos");
		

		
		System.out.println("\n---------Ejercicio 5-------------List()--------------------------");
System.out.println("Definir e inicializar una nueva lista vacía. Agregar a la lista vacía los primeros cien números enteros positivos.\n" + 
		"Imprimir el resultado por pantalla.\n");
		//List
		List<Integer> enteros = new ArrayList<Integer>();		
		System.out.println("Enteros: ");
//		System.out.println(enteros);
		for(int i=0; i<100;i++) {
				enteros.add(i);		
		}
		System.out.println(enteros);
		System.out.println("\n---------Ejercicio 6----------HashSet()-----------------------------");
		System.out.println("Definir e inicializar una nuevo conjunto vacío. Agregar al conjunto vacío cien veces el número 1.\n" + 
				"Imprimir el resultado por pantalla.\n");

		//HashSet (conjunto)
		HashSet<Integer> numero1 = new HashSet<Integer>();
		for(int i=0; i<100;i++) {
			numero1.add(1);
//			System.out.println(i);
		}
		System.out.println(numero1);
		System.out.println("Es un HashSet, por mas que inserte muchos si esta repetido, solo agrega uno");

		
		//Arraylist()
		
		

		
		
		//List() lista de nombre
		System.out.println("\n---------Ejercicio 7---------------------List()------------------");
		System.out.println("Crear una nueva clase llamada Prueba. Definir e implementar el siguiente método:\n" + 
				"public void imprimirPorPantalla(List<String> nombres)\n"
				+ "El método debe recorrer la lista de nombres e imprimir por pantalla cada nombre agregando delante del nombre “El\n" + 
				"nombre del alumno es: “.\n");
		List<String> nom = new ArrayList<String>();
		Prueba impPantalla = new Prueba();
		nom.add("Elisa");
		nom.add("Elisa");
		nom.add("Juan");
		nom.add("El");
		nom.add("Pedro");
		nom.add("Elisa");
		nom.add("Elisa");
		
		impPantalla.imprimirPorPantalla(nom);
		
		
		System.out.println("\n---------Ejercicio 8---------------HashSet()------------------------");
		System.out.println("Crear una nueva clase llamada Prueba. Definir e implementar el siguiente método:\n" + 
				"public void sumaTotal(Set<Integer> conjuntoDeEnteros)\n" + 
				"El método debe recorrer el conjunto de enteros, ir acumulando el total de la suma de los valores y al finalizar\n" + 
				"imprimir por pantalla el valor de la suma total.\n");
		Prueba p = new Prueba();
		p.sumaTotal(conjunto);
		System.out.println("\n---------Ejemplo de HashMap ---------------------------------------");
		//HashMaps()
		HashMap<String, Integer> edades = new HashMap<String, Integer>();
		edades.put("Pedro", 10);
		edades.put("Maria", 11);
		edades.put("Pablo", 35);
		edades.put("Tito", 95);
		System.out.println("------------------------------------------------");
		System.out.println("La edad de Pedro es "+edades.get("Pedro"));
		System.out.println("------------------------------------------------");
		for(String key: edades.keySet()) {
			System.out.println(key + " tiene "+ edades.get(key)+ " años.");
		}	
	
	}
	// cuando defino el metodo en la clase prueba no lo encuentra, no se bien porque.. lo encontre, es porque no estaba creando el Objeto de tipo prueba
//	public static void imprimirPorPantalla(List<String> nombres) {
//		System.out.println("------------------------------------------------");
//		for(int i=0; i< nombres.size(); i++ ) {
//			System.out.println("El nombre del Alumno es " + nombres.get(i));	
//			
//		}
//		
//	}


}
