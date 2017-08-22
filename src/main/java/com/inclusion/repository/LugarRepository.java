package com.inclusion.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.inclusion.entity.Lugar;

@Component
public interface LugarRepository extends CrudRepository<Lugar, Integer> {
	
 	public int deleteById(int id);
	
	public List<Lugar> findAll();	
    
	public Lugar findByNombreContaining(String nombre);

	public List<Lugar> findByNombreContainingIgnoreCase(String nombre);
	
	public List<Lugar> findByListaTiposDiscapacidad_NombreIn(List<String> nombres);
	
	public List<Lugar> findDistinctByListaSubCategoriasLugar_CategoriaLugar_NombreIn(List<String> nombres);
	
	public List<Lugar> findDistinctByListaTiposDiscapacidad_NombreInAndListaSubCategoriasLugar_CategoriaLugar_NombreInAndNombreContainingIgnoreCaseOrDescripcionContainingIgnoreCase(List<String> nombresTipoDiscapacidad, List<String> nombresCategorias, String nombreLugar, String descripcionLugar);
	
	default List<Lugar> busquedaAvanzada(String busqueda, List<String> nombresTipoDiscapacidad, List<String> nombresCategorias){
		return findDistinctByListaTiposDiscapacidad_NombreInAndListaSubCategoriasLugar_CategoriaLugar_NombreInAndNombreContainingIgnoreCaseOrDescripcionContainingIgnoreCase(nombresTipoDiscapacidad, nombresCategorias, busqueda, busqueda);
	}		
}