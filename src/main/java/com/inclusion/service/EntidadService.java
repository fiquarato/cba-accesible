package com.inclusion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inclusion.entity.Entidad;
import com.inclusion.repository.EntidadRepository;

@Service
public class EntidadService {

	@Autowired
	private EntidadRepository entidadRepository;
	
	@Transactional
	public Entidad save(Entidad entidad) {
		return entidadRepository.save(entidad);
	}
	
	public List<Entidad> findByNombre (String name){
		return entidadRepository.findByNombreContainingIgnoreCase(name);
	}
	
	public List<Entidad> findAll (){
		
		return entidadRepository.findAll();
	}
	
	@Transactional
	public int deleteById(int id) {
		return entidadRepository.deleteById(id);
	}
	
}
