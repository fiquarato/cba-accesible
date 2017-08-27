package com.inclusion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inclusion.entity.CategoriaLugar;
import com.inclusion.service.CategoriaLugarService;

@RestController
@RequestMapping("/servicecategorialugar")
public class CategoriaLugarController {
	
	@Autowired
	public CategoriaLugarService categoriaLugarService;
	
	@RequestMapping(value = "/findbynombre", method = RequestMethod.GET)
	public ResponseEntity<List<CategoriaLugar>> findByNombre(@RequestParam("nombre") String nombre) {
		return new ResponseEntity<List<CategoriaLugar>>(categoriaLugarService.findByNombre(nombre), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public ResponseEntity<List<CategoriaLugar>> findAll() {
		return new ResponseEntity<List<CategoriaLugar>>(categoriaLugarService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deletebyid", method = RequestMethod.GET)
	public ResponseEntity<Integer> deleteById(@RequestParam("id") int id) {
		return new ResponseEntity<Integer>(categoriaLugarService.deleteById(id), HttpStatus.OK);
	}	
}
