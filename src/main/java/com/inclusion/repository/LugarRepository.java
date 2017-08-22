package com.inclusion.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.inclusion.entity.Lugar;
import com.inclusion.entity.TipoDiscapacidad;

@Component
public interface EntidadRepository extends CrudRepository<Lugar, Integer> {
    
	public Lugar findByNombreContaining(String nombre);

	public List<Lugar> findByNombreContainingIgnoreCase(String nombre);
	
	public List<Lugar> findByListaTiposDiscapacidad_id(int id);
	
	public int deleteById(int id);
	
	public List<Lugar> findAll();	
		
}