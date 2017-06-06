package com.inclusion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inclusion.entity.Barrio;
import com.inclusion.service.BarrioService;

@RestController
@RequestMapping("/service")
public class BarrioController {
	
	@Autowired
	public BarrioService barrioService;
	
	@RequestMapping(value = "/savebarrio", method = RequestMethod.POST)
	public ResponseEntity<Barrio> saveBarrio(@RequestBody Barrio barrio) {
		return new ResponseEntity<Barrio>(barrioService.save(barrio), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public ResponseEntity<List<Barrio>> findAll() {
		return new ResponseEntity<List<Barrio>>(barrioService.findAll(), HttpStatus.OK);
	}
}
