package com.inclusion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inclusion.entity.SubCategoriaLugar;
import com.inclusion.entity.TipoDiscapacidad;
import com.inclusion.service.TipoDiscapacidadService;

@RestController
@RequestMapping("/servicetipodiscapacidad")
public class TipoDiscapacidadController {
	
	@Autowired
	public TipoDiscapacidadService tipoDiscapacidadService;

	@RequestMapping(value = "/findbynombre", method = RequestMethod.GET)
	public ResponseEntity<List<TipoDiscapacidad>> findByNombre(@RequestParam("nombre") String nombre) {
		return new ResponseEntity<List<TipoDiscapacidad>>(tipoDiscapacidadService.findByNombre(nombre), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public ResponseEntity<List<TipoDiscapacidad>> findAll() {
		return new ResponseEntity<List<TipoDiscapacidad>>(tipoDiscapacidadService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deletebyid", method = RequestMethod.GET)
	public ResponseEntity<Integer> deleteById(@RequestParam("id") int id) {
		return new ResponseEntity<Integer>(tipoDiscapacidadService.deleteById(id), HttpStatus.OK);
	}
}
