package piedra_papel_o_tijera;
import java.util.HashMap; // para usar diccionarios
import java.util.Map; // para usar diccionarios
import java.util.Scanner; // para pedir datos al usuario por consola


public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a -=PiedraPapelTijera=-. Para comenzar, escribe tu nombre y luego presiona Enter: ");
		
		Scanner entrada = new Scanner (System.in); // espera a que el usuario escriba algo y presione Enter
		String nombre = entrada.nextLine(); // captura lo que el usuario escribió
		
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("Bienvenido " + nombre + ". ¿ESTÁS LISTO PARA JUGAR?");
		System.out.println("Para jugar contra la Computadora, sólo debes escribir el número correspondiente a la jugada que deseas realizar. "
				+ " \n ¡MUCHA SUERTE! \n");
		
		// creamos un diccionario que contiene las tres jugadas
		//HASMAP ES IGUAL QUE UN ARRAY
		Map<Integer, String> jugadas=new HashMap<>();
		jugadas.put(1, "Piedra");
		jugadas.put(2, "Papel");
		jugadas.put(3, "Tijera");
		
		String opcion = null;
		int opcionJugador = 0;
		int opcionPC = 0;
		
		Map<Integer, String> ganador=new HashMap<>();
		ganador.put(0, "RESULTADO >>> TENEMOS UN EMPATE!");
		ganador.put(1, "RESULTADO >>> GANA EL JUGADOR "+nombre);
		ganador.put(2, "RESULTADO >>> GANA LA MÁQUINA");	
		int winner = 0;
		
		boolean salir = false;
		
		do {
			System.out.println("--------------------------------------");
			System.out.println("Selecciona una opción para jugar:");
			System.out.println("1- Piedra");
			System.out.println("2- Papel");
			System.out.println("3- Tijera");
			System.out.println("Cualquier otro caracter para Salir");
			
			opcionPC = (int) (Math.random() * 3) + 1; //genera un entero aleatorio entre 1 y 3
			
			entrada = new Scanner (System.in); // espera a que el usuario escriba algo y presione Enter
			opcion = entrada.nextLine(); // captura la opcion del usuario

			// Si podemos convertir la opción del jugador a entero es porque eligió un número
			//TRY TRATA DE ...
			try {
				opcionJugador = Integer.parseInt(opcion);	
			}catch(Exception e) {
				System.out.println("Muchas gracias por jugar, esperamos verte de nuevo por aquí!...");
				break;
			}
			
			switch(opcionJugador) {
				case 1: // jugador elije piedra
					if(opcionPC == 2) { // pc elije papel
						winner = 2; // gana pc
					}else if(opcionPC == 3) { // pc elije tijera
						winner = 1; // gana jugador
					}else { // pc elije piedra
						winner = 0; //empate
					}
					break;
					
				case 2: // jugador elije papel
					if(opcionPC == 2) { // pc elije papel
						winner = 0; // empate
					}else if(opcionPC == 3) { // pc elije tijera
						winner = 2; // gana pc
					}else { // pc elije piedra
						winner = 1; //gana jugador
					}
					break;
					
				case 3: // jugador elije tijera
					if(opcionPC == 2) { // pc elije papel
						winner = 1; // gana jugador
					}else if(opcionPC == 3) { // pc elije tijera
						winner = 0; // empate
					}else { // pc elije piedra
						winner = 2; //gana pc
					}
					break;
					
				default: // salir
					System.out.println("Muchas gracias por jugar, esperamos verte de nuevo por aquí!...");
					salir = true;
					break; // terminamos el programa
			} // end switch
			
			// Mostramos quién ganó el juego
			if(salir == false) {
				System.out.println(ganador.get(winner));
				System.out.println("DETALLE      >>> " + nombre + " usó " + jugadas.get(opcionJugador)+ " mientras que la Máquina jugó con " + jugadas.get(opcionPC));
			}
		} while(opcionJugador == 1 || opcionJugador == 2 || opcionJugador == 3);
	
		entrada.close(); // cierra el scanner
	}
}
