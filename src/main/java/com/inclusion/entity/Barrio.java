package com.inclusion.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Barrio {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nombre;
	
	@OneToMany(mappedBy = "barrio", fetch = FetchType.LAZY)
	private List<Entidad> entidad;
	
	public List<Entidad> getEntidad() {
		return entidad;
	}
	@JsonIgnore
	public void setEntidad(List<Entidad> entidad) {
		this.entidad = entidad;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
