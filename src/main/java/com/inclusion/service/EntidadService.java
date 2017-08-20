package com.inclusion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inclusion.entity.Lugar;
import com.inclusion.repository.EntidadRepository;

@Service
public class EntidadService {

	@Autowired
	private EntidadRepository entidadRepository;
	
	@Transactional
	public Lugar save(Lugar entidad) {
		return entidadRepository.save(entidad);
	}
	
	public List<Lugar> findByNombre (String name){
		return entidadRepository.findByNombreContainingIgnoreCase(name);
	}
	
	public List<Lugar> findByListaTiposDiscapacidad (int id){
		return entidadRepository.findByListaTiposDiscapacidad_id(id);
	}
	
	public List<Lugar> findAll (){		
		return entidadRepository.findAll();
	}
	
	@Transactional
	public int deleteById(int id) {
		return entidadRepository.deleteById(id);
	}
	
}
