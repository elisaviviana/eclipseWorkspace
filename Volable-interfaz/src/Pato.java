
public class Pato implements Volable {
	//Pato: un pato tiene una energía. Cada vez que el pato vuela pierde 5 unidades de energía e imprime por
	//pantalla “Estoy volando como un pato”
	
	private Integer energia;
	
	public Pato(Integer energi) {
		this.energia = energi;
	}
	public void Volar(){
		energia = energia-5;
		System.out.println("Estoy volando como un pato y tengo " +energia+" de energia");
	}
	
}
