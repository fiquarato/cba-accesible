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
import com.inclusion.service.SubCategoriaLugarService;

@RestController
@RequestMapping("/servicesubcategorialugar")
public class SubCategoriaLugarController {
	
	@Autowired
	public SubCategoriaLugarService subCategoriaLugarService;
	
	@RequestMapping(value = "/findbynombre", method = RequestMethod.GET)
	public ResponseEntity<List<SubCategoriaLugar>> findByNombre(@RequestParam("nombre") String nombre) {
		return new ResponseEntity<List<SubCategoriaLugar>>(subCategoriaLugarService.findByNombre(nombre), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public ResponseEntity<List<SubCategoriaLugar>> findAll() {
		return new ResponseEntity<List<SubCategoriaLugar>>(subCategoriaLugarService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deletebyid", method = RequestMethod.GET)
	public ResponseEntity<Integer> deleteById(@RequestParam("id") int id) {
		return new ResponseEntity<Integer>(subCategoriaLugarService.deleteById(id), HttpStatus.OK);
	}	
}
