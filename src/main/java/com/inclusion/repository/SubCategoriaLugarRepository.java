package com.inclusion.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.inclusion.entity.SubCategoriaLugar;

@Component
public interface SubCategoriaLugarRepository extends CrudRepository<SubCategoriaLugar, Integer> {
	
	public List<SubCategoriaLugar> findAll();	
	
	public int deleteById(int id);
    
	public SubCategoriaLugar findByNombreContaining(String nombre);

	public List<SubCategoriaLugar> findByNombreContainingIgnoreCase(String nombre);
	
	public List<SubCategoriaLugar> findById(int id);
	
	public List<SubCategoriaLugar> findByCategoriaLugar_Id(Integer id);
}
