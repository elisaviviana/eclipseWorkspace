package Main;
import misClases.JugadorDeFutbol;

import misClases.SesionDeEntrenamiento;


public class Principal {

	public static void main(String[] args) {
	
		JugadorDeFutbol Jugador1 = new JugadorDeFutbol("Pedro");
		JugadorDeFutbol Jugador2 = new JugadorDeFutbol("Pablo");
		
		SesionDeEntrenamiento sesion1 = new SesionDeEntrenamiento();
		SesionDeEntrenamiento sesion2 = new SesionDeEntrenamiento();
		
		System.out.println(Jugador1.getJugador());
	//	Jugador1.setenergia(100);
	//	Jugador1.setfelicidad(0);
	//	Jugador1.setgoles(0);
	//	Jugador1.setexperiencia(0);
		
		sesion1.entrenarA(Jugador1);
		sesion1.entrenarA(Jugador1);
		
		sesion2.entrenarA(Jugador2);
		
		System.out.println("La experiencia del jugador "+ Jugador1.getJugador()
				+ " la experiencia "+ Jugador1.getexperiencia()
				+ " e hizo tantos goles" + Jugador1.getgoles()
				);

		System.out.println("La experiencia del jugador "+ Jugador2.getJugador()+ " la experiencia "+ Jugador2.getexperiencia()
				+ " e hizo tantos goles" + Jugador2.getgoles()
				);
		

	}



}
