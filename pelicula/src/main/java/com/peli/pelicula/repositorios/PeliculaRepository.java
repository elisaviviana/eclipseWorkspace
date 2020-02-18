package com.peli.pelicula.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.peli.pelicula.entidades.Pelicula;


@Repository
//public interface PeliculaRepository extends CrudRepository<Pelicula, Long>, extends JpaRepository<Pelicula,Long,JpaSpecificationExecutor<Pelicula>> { //pelicula es la entidad y Long es el tipo de datos del ID
	public interface PeliculaRepository extends CrudRepository<Pelicula, Long> { //pelicula es la entidad y Long es el tipo de datos del ID

	//@Trasient datos volatiles, investigar
	List<Pelicula> findByTitulo (String titulofind);
	
	

}
