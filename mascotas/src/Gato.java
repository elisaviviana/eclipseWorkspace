
public class Gato extends Mascota {
	   //Atributos no hay ninguno, porque los hereda
		//-heredados de mascota
		//contructor
		public Gato(String nom, Integer ener) {
			this.nombre = nom;
			this.energia=ener;
		}
		//Metodos
		public void HacerRuido() {
			System.out.println("miau miau..");
		}

}
