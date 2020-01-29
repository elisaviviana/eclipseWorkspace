package misClases;

public class JugadorDeFutbol {
    private String	nombre;
	private Integer energia=100;
	private Integer felicidad=0;
	private Integer goles=0;
	//No entendi de que se trata experiencia
	private Integer experiencia=0;
	
	//contructor
		public JugadorDeFutbol(String nombre) {
			this.nombre = nombre;
		}
	//Setters and Getters
		public String getJugador() {
			return this.nombre;
		}
		public void setenergia(Integer energia) {
			this.energia=energia;
		}		
		public void setfelicidad(Integer feli) {
			this.felicidad=feli;
		}
		public Integer getFelicidad() {
			return this.felicidad;	
		}
		public void setgoles(Integer goles) {
			this.goles=goles;
		}
		public Integer getgoles() {
			return this.goles;
		}
		public void setexperiencia(Integer exp) {
			this.experiencia= this.experiencia + exp;
		}
		public Integer getexperiencia() {
			return this.experiencia;
		}
		
		
	//Metodos
		public void hacerGol () {
			this.energia = this.energia-5;
			this.felicidad=this.felicidad+10;
			this.goles= this.goles+1;
			System.out.println("“GOOOOL!”");
			
		}
		
		public void correr () {
			this.energia = this.energia-10;
			
			System.out.println("Estoy corrindo - No me dan mas las piernas");
			
			
		}
	
	
	

}
