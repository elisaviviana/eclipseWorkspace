
public class Superman implements Volable {
	//Superman: superman tiene experiencia. Cada vez que superman vuela aumenta 3 unidades su experiencia
	//e imprime por pantalla “Estoy volando como un campeón”
	
	private Integer experiencia=0;
	
	public Superman() {
		
	}
	public void Volar() {
		experiencia = experiencia+3;
		System.out.println("Estoy volando como un campeón y tengo "+experiencia + " de experiencia");
		
	}

}
