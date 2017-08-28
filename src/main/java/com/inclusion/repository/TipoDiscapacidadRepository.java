package com.inclusion.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.inclusion.entity.TipoDiscapacidad;

@Component
public interface TipoDiscapacidadRepository extends CrudRepository<TipoDiscapacidad, Integer> {
	
	public List<TipoDiscapacidad> findAll();	
	
	public int deleteById(int id);
    
	public TipoDiscapacidad findByNombreContaining(String nombre);

	public List<TipoDiscapacidad> findByNombreContainingIgnoreCase(String nombre);
	
	public List<TipoDiscapacidad> findById(int id);
}
