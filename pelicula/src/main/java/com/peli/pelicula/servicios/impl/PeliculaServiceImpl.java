package com.peli.pelicula.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peli.pelicula.entidades.Pelicula;
import com.peli.pelicula.repositorios.PeliculaRepository;
import com.peli.pelicula.servicios.PeliculaService;
import com.sun.tools.javac.code.Attribute.Array;

@Service 
public class PeliculaServiceImpl implements PeliculaService {
	private boolean okguardar = false;
	
	@Autowired
	private PeliculaRepository pelirepo;  //inyectamos del repository

	@Override
	public void guardar(Pelicula modelAgregarPeli) {
		// TODO Auto-generated method stub
		
//		verificar no duplicar la pelicula
//		traer todas las peliculas guardadas y comprarla con la que estoy guardando
//		para traer las peliculas creamos un objeto nuevo y lo meto a un array
//		recorro el array comprarando con el titulo nuevo
		
//		NO CON Array .class buscar la pelicula
		
		
//		bucar la pelicula por el titulo y no por el id
//		si exite aviso al usuario
//		y sino lo guardo
		
		 okguardar =  validarTitulo(modelAgregarPeli.getTitulo());
	
		
		
//		debo verificar que el titulo sea distinto de null
//		validar los datos
		
		String categoria = modelAgregarPeli.getCategoria();
		 
		if (categoria  != null ) {
			 okguardar = true;
		}
				
//		y enviar los datos a la base de datos... esto lo hace el repository
		
		if(okguardar) {
		pelirepo.save(modelAgregarPeli);

		}
				
	}

	private boolean validarTitulo(String titulo) {
		// TODO Auto-generated method stub
//		si exite la peli es true
//		no esta es false
		
		pelirepo.findByTitulo(titulo);
		return false;
	}





	

}
