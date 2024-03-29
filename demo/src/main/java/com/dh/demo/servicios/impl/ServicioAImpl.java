package com.dh.demo.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dh.demo.entidades.MiEntidad;
import com.dh.demo.servicios.MiInterfazServicio;


@Service("servicioA")
public class ServicioAImpl implements MiInterfazServicio {
	
	/**
	 * Genero una lista
	 */
	public List<MiEntidad> generarLista(){
		List<MiEntidad> miEntidad = new ArrayList<MiEntidad>();
		MiEntidad entidad;
		for(int i=0;i<=10;i++){
			entidad = new MiEntidad();
			entidad.setId(new Long(i));
			entidad.setName("entidad" + i);
			entidad.setCantidad(i);
			miEntidad.add(entidad);
		}
		return miEntidad;
	}

	@Override
	public MiEntidad encontrarPorId(Long id, List<MiEntidad> listaConTodasLasEntidades) {
		// TODO Auto-generated method stub
		for (MiEntidad unaEntidad : listaConTodasLasEntidades) {
			if(unaEntidad.getId().compareTo(id)==0){
				return unaEntidad;
			}
		}
		return null;
	}
}
