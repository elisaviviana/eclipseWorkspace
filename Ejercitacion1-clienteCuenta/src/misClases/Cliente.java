package misClases;

public class Cliente {
	private String nombre;
	private String apellido;
	
	//Setters and Getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	//Contructor vacio
	public Cliente() {
		
	}
	//contructor sobrecargado
	public Cliente(String nom, String ape) {
		this.nombre=nom;
		this.apellido=ape;
	}
	
	

}
