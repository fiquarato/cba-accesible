package com.inclusion.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.inclusion.entity.Entidad;

@Component
public interface EntidadRepository extends CrudRepository<Entidad, Integer> {
    
	public Entidad findByNombre(String nombre);
	
	public int deleteById(int id);
	
	public List<Entidad> findAll();	
		
}