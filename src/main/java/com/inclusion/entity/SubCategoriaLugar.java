package com.inclusion.entity;

import javax.persistence.*;

import javax.validation.constraints.NotNull;

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
	public CategoriaLugar getCategoriaLugar() {
		return categoriaLugar;
	}
	public void setCategoriaLugar(CategoriaLugar categoriaLugar) {
		this.categoriaLugar = categoriaLugar;
	}
}
