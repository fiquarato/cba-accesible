package com.inclusion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inclusion.entity.SubCategoriaLugar;
import com.inclusion.entity.TipoDiscapacidad;
import com.inclusion.repository.TipoDiscapacidadRepository;

@Service
public class TipoDiscapacidadService {

	@Autowired
	private TipoDiscapacidadRepository tipoDiscapacidadRepository;
	
	@Transactional
	public TipoDiscapacidad save(TipoDiscapacidad tipoDiscapacidad) {
		return tipoDiscapacidadRepository.save(tipoDiscapacidad);
	}
	
	public List<TipoDiscapacidad> findById (int id){
		return tipoDiscapacidadRepository.findById(id);
	}
	
	public List<TipoDiscapacidad> findByNombre (String name){
		return tipoDiscapacidadRepository.findByNombreContainingIgnoreCase(name);
	}
	
	public List<TipoDiscapacidad> findAll (){		
		return tipoDiscapacidadRepository.findAll();
	}
	
	@Transactional
	public int deleteById(int id) {
		return tipoDiscapacidadRepository.deleteById(id);
	}
}
