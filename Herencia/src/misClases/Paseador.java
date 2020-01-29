package misClases;

public class Paseador extends Persona {

	//Contructor
	public Paseador(String nom, String ape, Integer dni) {
		this.nombre = nom;
		this.apellido = ape;
		this.dni = dni;
		//String SQL = "Insert into Paseador values ("+ this.nombre +")";
		
	}
	
	//Responsabilidades (Metodos), acciones que los objetos de esas clases se compromenten a realizar
	public void PasearPerro(Perro p) {
		System.out.println("El paseador "+ this.nombre + " "+
	this.apellido + " esta paseando a " +p.getNombre());
		
		
	}
	 
	public void Jugardenuevo(Perro p) {
		System.out.println("El paseador "+ this.nombre + " "+
				this.apellido + " esta paseando de nuevo a " +p.getNombre());
		
	}

	
	
	
	

}
