package com.peli.pelicula.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.peli.pelicula.entidades.Pelicula;

@Service
public interface PeliculaService {

	void guardar(Pelicula modelAgregarPeli);
		

}
