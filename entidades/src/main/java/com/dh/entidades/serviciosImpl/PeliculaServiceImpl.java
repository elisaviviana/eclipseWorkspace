package com.dh.entidades.serviciosImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dh.entidades.entidades.Pelicula;
import com.dh.entidades.repositorios.PeliculaRepository;
import com.dh.entidades.servicios.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService{
	@Autowired
	private PeliculaRepository peliculaRepository;

	@Override
	public List<Pelicula> buscaTodasLasPeliculas() {
		List<Pelicula> peliculas = peliculaRepository.findAll();
		return peliculas;
	}

}
