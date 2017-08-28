package com.inclusion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inclusion.entity.SubCategoriaLugar;
import com.inclusion.repository.SubCategoriaLugarRepository;

@Service
public class SubCategoriaLugarService {
	
	@Autowired
	private SubCategoriaLugarRepository subCategoriaLugarRepository;
	
	@Transactional
	public SubCategoriaLugar save(SubCategoriaLugar subCategoriaLugar) {
		return subCategoriaLugarRepository.save(subCategoriaLugar);
	}
	
	public List<SubCategoriaLugar> findById (int id){
		return subCategoriaLugarRepository.findById(id);
	}
	
	public List<SubCategoriaLugar> findByNombre (String name){
		return subCategoriaLugarRepository.findByNombreContainingIgnoreCase(name);
	}
	
	public List<SubCategoriaLugar> findByCategoriaId (Integer id){
		return subCategoriaLugarRepository.findByCategoriaLugar_Id(id);
	}
	
	public List<SubCategoriaLugar> findAll (){		
		return subCategoriaLugarRepository.findAll();
	}
	
	@Transactional
	public int deleteById(int id) {
		return subCategoriaLugarRepository.deleteById(id);
	}
}
