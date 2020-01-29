
public class Avion implements Volable {
	//Avión: un avión tiene horas de vuelo. Cada vez que el avión vuela incrementa 13 hs de vuelo e imprime por
	//pantalla “Estoy volando como un avión.”
	
	private Integer horasVuelo=0;
	
	public Avion(){
	
	}
	public void Volar() {
		horasVuelo = horasVuelo+13;
		System.out.println("Estoy volando como un avion y tengo " +horasVuelo+" de horas de vuelo");
	}

}
