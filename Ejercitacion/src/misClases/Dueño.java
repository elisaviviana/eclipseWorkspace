package misClases;

import java.util.ArrayList;

public class Dueño {
	//Atributos
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer dni;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//Metodos y responsabilidades
	//public Perro getMascota() {
	//	return mascota;
	//}
	//public void setMascota(Perro mascota) {
	//	this.mascota = mascota;
	//}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public ArrayList<Perro> getMascotas() {
		return mascotas;
	}
	public void setMascotas(ArrayList<Perro> mascotas) {
		this.mascotas = mascotas;
	}
	public void asignarMascota(Perro p) {
		mascotas.add(p);
	}

}
