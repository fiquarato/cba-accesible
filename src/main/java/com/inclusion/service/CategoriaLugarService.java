package com.inclusion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inclusion.entity.CategoriaLugar;
import com.inclusion.repository.CategoriaLugarRepository;
import com.inclusion.repository.SubCategoriaLugarRepository;

@Service
public class CategoriaLugarService {

	@Autowired
	private CategoriaLugarRepository categoriaLugarRepository;
	
	@Transactional
	public CategoriaLugar save(CategoriaLugar categoriaLugar) {
		return categoriaLugarRepository.save(categoriaLugar);
	}
	
	public List<CategoriaLugar> findById (int id){
		return categoriaLugarRepository.findById(id);
	}
	
	public List<CategoriaLugar> findByNombre (String name){
		return categoriaLugarRepository.findByNombreContainingIgnoreCase(name);
	}
	
	public List<CategoriaLugar> findAll (){		
		return categoriaLugarRepository.findAll();
	}
	
	@Transactional
	public int deleteById(int id) {
		return categoriaLugarRepository.deleteById(id);
	}
	
}
