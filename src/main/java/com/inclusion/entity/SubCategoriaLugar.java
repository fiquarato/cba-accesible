package com.inclusion.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class SubCategoriaLugar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer id;
	@NotNull
	@Column(unique = true)
	private String nombre;
	private String descripcion;
	@ManyToOne
	@JoinColumn(name = "categoriaLugarId")
	private CategoriaLugar categoriaLugar;
	
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@JsonIgnore()
	@RequestMapping("/servicesubcategorialugar/findall")
	public CategoriaLugar getCategoriaLugar() {
		return categoriaLugar;
	}
	public void setCategoriaLugar(CategoriaLugar categoriaLugar) {
		this.categoriaLugar = categoriaLugar;
	}
}
