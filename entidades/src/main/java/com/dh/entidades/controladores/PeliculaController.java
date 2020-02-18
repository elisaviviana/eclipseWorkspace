package com.dh.entidades.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dh.entidades.entidades.Pelicula;
import com.dh.entidades.servicios.PeliculaService;

@RestController
public class PeliculaController {
	@Autowired
	PeliculaService peliculaService; //inyeccion
	
	@GetMapping("/findAll")
	public List<Pelicula> buscarPeliculas(){
		return peliculaService.buscaTodasLasPeliculas();
	}

}
