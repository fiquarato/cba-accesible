package com.inclusion.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.inclusion.entity.CategoriaLugar;

@Component
public interface CategoriaLugarRepository extends CrudRepository<CategoriaLugar, Integer> {
	
	public List<CategoriaLugar> findAll();	
	
	public int deleteById(int id);
    
	public CategoriaLugar findByNombreContaining(String nombre);

	public List<CategoriaLugar> findByNombreContainingIgnoreCase(String nombre);
	
	public List<CategoriaLugar> findById(int id);
	
}
