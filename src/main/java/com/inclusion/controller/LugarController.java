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
import com.inclusion.service.LugarService;

@RestController
@RequestMapping("/servicelugar")
public class LugarController {
	
	@Autowired
	public LugarService lugarService;

	@RequestMapping(value = "/findbynombre", method = RequestMethod.GET)
	public ResponseEntity<List<Lugar>> findByNombre(@RequestParam("nombre") String nombre) {
		return new ResponseEntity<List<Lugar>>(lugarService.findByNombre(nombre), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findbytipodiscapacidad", method = RequestMethod.GET)
	public ResponseEntity< List<Lugar>> findByTipoDiscapacidad(@RequestParam("nombres") List<String> nombres) {
		return new ResponseEntity<List<Lugar>>(lugarService.findByListaTiposDiscapacidad(nombres), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findbycategorias", method = RequestMethod.GET)
	public ResponseEntity< List<Lugar>> findByCategorias(@RequestParam("nombres") List<String> nombres) {
		return new ResponseEntity<List<Lugar>>(lugarService.findByCategorias(nombres), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/busquedaavanzada", method = RequestMethod.GET)
	public ResponseEntity< List<Lugar>> findByCategorias(@RequestParam("textoBusqueda") String textoBusqueda,
				@RequestParam("nombresTipoDiscapacidad") List<String> nombresTipoDiscapacidad,
				@RequestParam("nombresCategorias") List<String> nombresCategorias) {
		return new ResponseEntity<List<Lugar>>(lugarService.busquedaAvanzada(textoBusqueda, nombresTipoDiscapacidad, nombresCategorias), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/savelugar", method = RequestMethod.POST)
	public ResponseEntity<Lugar> saveLugar(@RequestBody Lugar lugar) {
		return new ResponseEntity<Lugar>(lugarService.save(lugar), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public ResponseEntity<List<Lugar>> findAll() {
		return new ResponseEntity<List<Lugar>>(lugarService.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/deletebyid", method = RequestMethod.GET)
	public ResponseEntity<Integer> deleteById(@RequestParam("id") int id) {
		return new ResponseEntity<Integer>(lugarService.deleteById(id), HttpStatus.OK);
	}	
	
}
