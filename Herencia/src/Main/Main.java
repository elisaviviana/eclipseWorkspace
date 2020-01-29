package Main;
import misClases.Perro;
import misClases.Paseador;

import java.util.ArrayList;

import misClases.Dueño;

public class Main {

	public static void main(String[] args) {
		//Instanciamos
		Perro miPerro = new Perro();
		
		//si las variables de la clase perro son publicas,
		//pero lo ideal es no hacerlas privadas
		//miPerro.nombre = "Luna";
		//miPerro.raza = "Labrador";
		//Metodos getter
		miPerro.setNombre("Luna");
		miPerro.setRaza("Labrador") ;

		miPerro.getNombre();
		
		
		System.out.println(miPerro.getNombre() + "-" + miPerro.getRaza());
		
		//usar el constructor sobrecargado
		Perro miSegundoPerro = new Perro("Bruno","Pichichu");
		System.out.println(miSegundoPerro.getNombre() + "-" + miSegundoPerro.getRaza());

		miSegundoPerro.setPeso(22);
		System.out.println(miSegundoPerro.getNombre() + "-" + miSegundoPerro.getRaza()+"-"+miSegundoPerro.getPeso());
	//el metodo Ladrar tiene que ser publico, si es privado no puedo llamarlo
	miSegundoPerro.Ladrar();
		
	Paseador paseador1 = new  Paseador("Pedro","Novoa",74856788);
	paseador1.PasearPerro(miSegundoPerro);

	
	
	Dueño dueño1 = new  Dueño("Elisa","yo",74856788);
//dueño1.setMascota(miSegundoPerro);


	//System.out.println(
	//		"La persona " + dueño1.getNombre() + " es dueño de " +
	//dueño1.getMascota().getNombre()
	//			);
	//Definiendo un array
	//ArrayList<Perro> perros;
	//perros.add(new Perro());
	//dueño1.setMascotas(perros);

	dueño1.asignarMascota(new Perro("Branca", "Pichichu"));
	dueño1.asignarMascota(new Perro("Thar", "Dogo Agentino"));
	ArrayList<Perro> mascotas = dueño1.getMascotas();
	for (Integer i = 0; i< mascotas.size();i++) {
		System.out.println(mascotas.get(i).getNombre());
	}
	
	
	
	}
}
