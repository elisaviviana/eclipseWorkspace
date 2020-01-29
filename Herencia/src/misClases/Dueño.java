package misClases;

import java.util.ArrayList;

public class Dueño extends Persona {
	//Atributos
//	private Perro mascota; //para asignarle solo una mascota
	private ArrayList<Perro> mascotas = new ArrayList<>();
	
	//Contructor
	public Dueño() {
		
	}
	public Dueño(String nom, String ape, Integer dni) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = dni;
		//String SQL = "Insert into Paseador values ("+ this.nombre +")";
		
	}
	//getters & Setters de los atributos opcionales

	//Metodos y responsabilidades
	

	
	public ArrayList<Perro> getMascotas() {
		return mascotas;
	}
	public void setMascotas(ArrayList<Perro> mascotas) {
		this.mascotas = mascotas;
	}
	public void asignarMascota(Perro p) {
		mascotas.add(p);
	}

	//para sobreescribir metodos.. no contructores
	@Override
	public void Jugar(Perro p) {
		System.out.println(p.getNombre()+ " esta jugando con "+ this.nombre+ " el patio de su casa");
	}
	public void Jugardenuevo(Perro p) {
		System.out.println(p.getNombre()+ " esta jugando de nuevo con "+ this.nombre+ " el patio de su casa");
	}
}
