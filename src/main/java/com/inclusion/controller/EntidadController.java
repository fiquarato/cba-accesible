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

import com.inclusion.entity.Lugar;
import com.inclusion.entity.TipoDiscapacidad;
import com.inclusion.service.EntidadService;

@RestController
@RequestMapping("/service")
public class EntidadController {
	
	@Autowired
	public EntidadService entidadService;

	@RequestMapping(value = "/findbynombre", method = RequestMethod.GET)
	public ResponseEntity<List<Lugar>> findByNombre(@RequestParam("nombre") String nombre) {
		return new ResponseEntity<List<Lugar>>(entidadService.findByNombre(nombre), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findbytipodiscapacidad", method = RequestMethod.GET)
	public ResponseEntity<List<Lugar>> findByTipoDiscapacidad(@RequestParam("tipoDiscapacidad") List<TipoDiscapacidad> listaTiposDiscapacidad) {
		return new ResponseEntity<List<Lugar>>(entidadService.findByTipoDiscapacidad(listaTiposDiscapacidad), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/saveentidad", method = RequestMethod.POST)
	public ResponseEntity<Lugar> saveEntidad(@RequestBody Lugar entidad) {
		return new ResponseEntity<Lugar>(entidadService.save(entidad), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public ResponseEntity<List<Lugar>> findAll() {
		return new ResponseEntity<List<Lugar>>(entidadService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deletebyid", method = RequestMethod.GET)
	public ResponseEntity<Integer> deleteById(@RequestParam("id") int id) {
		return new ResponseEntity<Integer>(entidadService.deleteById(id), HttpStatus.OK);
	}	
	
}
