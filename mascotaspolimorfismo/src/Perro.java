
public class Perro extends Mascota implements Paseable{
    //Atributos no hay ninguno, porque los hereda
	//-heredados de mascota
	//contructor
	public Perro(String nom, Integer ener) {
		this.nombre = nom;
		this.energia=ener;
	}
	//Metodos
	@Override 
	public void Dormir(Integer horas)
	{
		System.out.println("wolf wolf");
		//Esto esta bien, pero repito codigo ... mejor lo hacemos con super
		//System.out.println(this.nombre + " se durmió..");
		//this.energia = this.energia + 20;
		super.Dormir(horas);
	}
	@Override
	public void HacerRuido() {
		System.out.println("wolf");
	}
	
	@Override
	public void HacerPis() {
		System.out.println(this.nombre + " esta haciendo pis en el arbol del vecino");
	}
	
}
