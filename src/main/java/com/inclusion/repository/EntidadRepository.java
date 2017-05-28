package com.inclusion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.inclusion.entity.Entidad;

@Component
public interface EntidadRepository extends CrudRepository<Entidad, Integer> {
    
	public Entidad findByNombre(String nombre);
		
}