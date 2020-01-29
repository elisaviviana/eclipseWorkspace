package misClases;

public class SesionDeEntrenamiento {
	private Integer experiencia1=5;
	

	//constructor
	public SesionDeEntrenamiento() {
		
	}
	
	

	
		
	//metodos
	
//	public Integer entrenarA (JugadorDeFutbol F) {
//		
//		this.experiencia = this.experiencia + F.correr();
//		this.experiencia = this.experiencia + F.hacerGol();
//		
//		this.experiencia = this.experiencia + F.correr();
//		
//		return this.experiencia;
//		
//	}
	
	public void entrenarA (JugadorDeFutbol F) {
		F.correr();
		F.hacerGol();
		F.correr();
		F.setexperiencia(this.experiencia1);
	}



}
