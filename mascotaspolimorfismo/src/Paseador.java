
public class Paseador {
	public void PaseadorMascota (Paseable m) {
//		convertir el m paseable a mascota
		Mascota mascotaPaseable = (Mascota) m;
		
		System.out.println("El paseador salio a caminar con "+ mascotaPaseable.nombre);
	}

}
