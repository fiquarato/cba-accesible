package com.inclusion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inclusion.entity.Lugar;
import com.inclusion.repository.LugarRepository;

@Service
public class EntidadService {

	@Autowired
	private LugarRepository entidadRepository;
	
	@Transactional
	public Lugar save(Lugar entidad) {
		return entidadRepository.save(entidad);
	}
	
	public List<Lugar> findByNombre (String name){
		return entidadRepository.findByNombreContainingIgnoreCase(name);
	}
	
	public List<Lugar> findByListaTiposDiscapacidad (List<String> nombres){
		return entidadRepository.findByListaTiposDiscapacidad_NombreIn(nombres);
	}
	
	public List<Lugar> findByCategorias (List<String> nombres){
		return entidadRepository.findDistinctByListaSubCategoriasLugar_CategoriaLugar_NombreIn(nombres);
	}
	
	public List<Lugar> busquedaAvanzada(String textoBusqueda, List<String> nombresTipoDiscapacidad, List<String> nombresCategorias){
		return entidadRepository.busquedaAvanzada(textoBusqueda, nombresTipoDiscapacidad, nombresCategorias);
	}
	
	public List<Lugar> findAll (){		
		return entidadRepository.findAll();
	}
	
	@Transactional
	public int deleteById(int id) {
		return entidadRepository.deleteById(id);
	}
	
}
