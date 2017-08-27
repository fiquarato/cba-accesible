package com.inclusion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Strings;
import com.inclusion.entity.Lugar;
import com.inclusion.repository.LugarRepository;

@Service
public class LugarService {

	@Autowired
	private LugarRepository lugarRepository;
	
	@Transactional
	public Lugar save(Lugar lugar) {
		return lugarRepository.save(lugar);
	}
	
	public List<Lugar> findByNombre (String name){
		return lugarRepository.findByNombreContainingIgnoreCase(name);
	}
	
	public List<Lugar> findByListaTiposDiscapacidad (List<String> nombres){
		return lugarRepository.findByListaTiposDiscapacidad_NombreIn(nombres);
	}
	
	public List<Lugar> findByCategorias (List<String> nombres){
		return lugarRepository.findDistinctByListaSubCategoriasLugar_CategoriaLugar_NombreIn(nombres);
	}
	
	public List<Lugar> busquedaAvanzada(String textoBusqueda, List<String> nombresTipoDiscapacidad, List<String> nombresCategorias){
		if (Strings.isNullOrEmpty(textoBusqueda)) {
			if (nombresTipoDiscapacidad.isEmpty()) {
				return lugarRepository.findDistinctByListaSubCategoriasLugar_CategoriaLugar_NombreIn(nombresCategorias);
			}
			else if (nombresCategorias.isEmpty()) {
				return lugarRepository.findByListaTiposDiscapacidad_NombreIn(nombresTipoDiscapacidad);
			}
			else {
				return lugarRepository.findDistinctByListaTiposDiscapacidad_NombreInAndListaSubCategoriasLugar_CategoriaLugar_NombreIn(nombresTipoDiscapacidad, nombresCategorias);
			}
		}
		else if (nombresTipoDiscapacidad.isEmpty()) {
			if (nombresCategorias.isEmpty()) {
				return lugarRepository.findByNombreContainingIgnoreCaseOrDescripcionContainingIgnoreCase(textoBusqueda, textoBusqueda);
			}
			else return lugarRepository.findDistinctByListaSubCategoriasLugar_CategoriaLugar_NombreInAndNombreContainingIgnoreCaseOrDescripcionContainingIgnoreCase(nombresCategorias, textoBusqueda, textoBusqueda);
		}
		else if (nombresCategorias.isEmpty()){
			return lugarRepository.findByListaTiposDiscapacidad_NombreInAndNombreContainingIgnoreCaseOrDescripcionContainingIgnoreCase(nombresTipoDiscapacidad, textoBusqueda, textoBusqueda);
		}
		else return lugarRepository.busquedaAvanzada(textoBusqueda, nombresTipoDiscapacidad, nombresCategorias);
	}
	
	public List<Lugar> findAll (){		
		return lugarRepository.findAll();
	}
	
	@Transactional
	public int deleteById(int id) {
		return lugarRepository.deleteById(id);
	}
	
}
