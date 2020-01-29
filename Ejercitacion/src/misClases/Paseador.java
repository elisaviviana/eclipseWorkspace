package misClases;

public class Paseador {
	//Atributos
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer dni;
	//Contructor
	public Paseador() {
		
	}
	public Paseador(String nom, String ape, Integer dni) {
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
	
	//Responsabilidades (Metodos), acciones que los objetos de esas clases se compromenten a realizar
	public void PasearPerro(Perro p) {
		System.out.println("El paseador "+ this.nombre + " "+
	this.apellido + " esta paseando a " +p.getNombre());
		
		
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	
	
	

}
