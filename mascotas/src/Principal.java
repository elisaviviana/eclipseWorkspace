
public class Principal {

	public static void main(String[] args) {

		//Mascota m = new Mascota(); no podemos instanciar un objeto del c
		//lase mascota porque es abtracta
		
		Perro p = new Perro("Luna", 10);
		p.MostrarEnergia();

		p.HacerRuido();
		//p.Dormir(0);
		p.Dormir(2);
		p.MostrarEnergia();
		
		Gato g = new Gato("Mini",20);
		g.MostrarEnergia();
		g.HacerRuido();
		g.Dormir(4);
		g.MostrarEnergia();
	}

}
