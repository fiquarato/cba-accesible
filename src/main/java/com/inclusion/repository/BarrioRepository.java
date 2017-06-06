package com.inclusion.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.inclusion.entity.Barrio;

	@Component
	public interface BarrioRepository extends CrudRepository<Barrio, Integer> {
		
		public List<Barrio> findAll();
		
		public Barrio findByNombre(String nombre);
		
}
