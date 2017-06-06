package com.inclusion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inclusion.entity.Barrio;
import com.inclusion.repository.BarrioRepository;

@Service
public class BarrioService {
	
	@Autowired
	private BarrioRepository barrioRepository;
	
	@Transactional
	public Barrio save(Barrio barrio) {
		return barrioRepository.save(barrio);
	}
	
	public List<Barrio> findAll() {
		return barrioRepository.findAll();
	}	

}