package com.dh.entidades.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dh.entidades.entidades.Pelicula;

@Repository
public interface PeliculaRepository extends CrudRepository<Pelicula, Long>{

	List<Pelicula> findAll();

}
