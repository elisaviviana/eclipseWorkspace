package misClases;

//Una clase abstracta es para tener solo la estructura, no se puede crear objetos de esta clase
public abstract class Persona { //sin contructores
//public class Persona {
	//Atributos
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected Integer dni;
	

	//Contructor
	public Persona() {
		
	}
	public Persona(String nom, String ape, Integer dni) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = dni;
		
	}
	//getters & Setters de los atributos opcionales
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
	
	//Responsabilidades (Metodos), acciones que los objetos de esas clases se compromenten a realizar
	public void PasearPerro(Perro p) {
		System.out.println("El paseador "+ this.nombre + " "+
	this.apellido + " esta paseando a " +p.getNombre());
		
		
	}
	public void Jugar(Perro p) {
		System.out.println(p.getNombre()+ " esta jugando con "+ this.nombre+ " el patio de su casa");
	}
	
	public abstract void Jugardenuevo(Perro p);
	
	}

	
	


