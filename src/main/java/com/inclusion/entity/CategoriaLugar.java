package com.inclusion.entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CategoriaLugar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull
	@Column(unique = true)
	private String nombre;
	private String descripcion;
	@OneToMany(mappedBy = "categoriaLugar", fetch = FetchType.LAZY) 
	private List<SubCategoriaLugar> listaSubCategoriaLugar;
	
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
	@JsonIgnore
	public List<SubCategoriaLugar> getListaSubCategoriaLugar() {
		return listaSubCategoriaLugar;
	}
	public void setListaSubCategoriaLugar(List<SubCategoriaLugar> listaSubCategoriaLugar) {
		this.listaSubCategoriaLugar = listaSubCategoriaLugar;
	}
}
