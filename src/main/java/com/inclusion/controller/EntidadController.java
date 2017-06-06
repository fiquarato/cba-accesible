package com.inclusion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inclusion.entity.Barrio;
import com.inclusion.entity.Entidad;
import com.inclusion.service.EntidadService;

@RestController
@RequestMapping("/service")
public class EntidadController {
	
	@Autowired
	public EntidadService entidadService;

	@RequestMapping(value = "/findbynombre", method = RequestMethod.GET)
	public ResponseEntity<Entidad> findByNombre(@RequestParam("nombre") String nombre) {
		return new ResponseEntity<Entidad>(entidadService.findByNombre(nombre), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/saveentidad", method = RequestMethod.POST)
	public ResponseEntity<Entidad> saveEntidad(@RequestBody Entidad entidad) {
		return new ResponseEntity<Entidad>(entidadService.save(entidad), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findbybarrio", method = RequestMethod.GET)
	public ResponseEntity<List<Entidad>> findByBarrio(@RequestBody String barrio) {
		return new ResponseEntity<List<Entidad>>(entidadService.findByBarrio(barrio), HttpStatus.OK);
	}
	
	
}
