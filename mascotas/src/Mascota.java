
public abstract class Mascota {
	//Atributos
	protected String nombre;
	protected Integer energia;
	
	//contructor
	public Mascota() {
		
	}
	//metodos
	public void Dormir(Integer horas){
		
	if(horas ==0) {
		System.out.println(this.nombre + " se durmió..");
	}else if(horas > 0) {
		System.out.println(this.nombre + " se durmió " + horas + "hs");
	}
		this.energia = this.energia + 20;
	}
	public abstract void HacerRuido(); 

	public void MostrarEnergia() {
		System.out.println("La energia de "+this.nombre+" es de "+ this.energia);
		
	}
}
