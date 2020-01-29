
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
		System.out.println("..........................");
		//Polimorfismo
		Mascota m;
		m = new Perro("Brueno",10);
		m.HacerRuido();
		m.Dormir(7);
		
		System.out.println("..........................");
		//tambien puedo asignarle un perro creado anteriormente
		m = p;
		m.HacerRuido();
		m.Dormir(7);
		
		System.out.println("..........................");

		m= new Gato("pichi",5);
		m.HacerRuido();
		m.Dormir(9);
		System.out.println("..........................");
		Paseador paseador = new Paseador();
		//paseador.PaseadorMascota(m); es un gato que no hemos definido como paseable
		paseador.PaseadorMascota(p);
		paseador.PaseadorMascota(new Perro("Bruno",10));
	
		p.HacerPis();
		
		
	}

}
