package misClases;

public class Perro {
	private String nombre;
	private String raza;
	private Integer peso;
	
	//constructor
	public Perro() {
		//constructor vacio
	}
	
	//constructor sobrecargado, solo los atributos obligatorios
	public Perro(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	//Getters & Setters
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	public String getNombre( ) {
		return this.nombre;
	}
	//si tuviese el mismo nombre, se puede hacer de esta forma
	//void es cuando la funcion no retorna nada
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getRaza() {
		return this.raza;
	}
	 
	public void setPeso(Integer kg) {
		this.peso=kg;
	}
	public Integer getPeso() {
		return this.peso;
	}
	//Metodos de la clase perro
	public void Ladrar() {
		System.out.println("Wof whoof whoof.. (El perro"+ this.nombre + " esta ladrando)");
	}
}
