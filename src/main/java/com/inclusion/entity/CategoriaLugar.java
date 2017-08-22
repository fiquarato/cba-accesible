package com.inclusion.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private List<SubCategoriaLugar> listaTipoSubCategoriaLugar;
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
	public List<SubCategoriaLugar> getListaTipoSubCategoriaLugar() {
		return listaTipoSubCategoriaLugar;
	}
	public void setListaTipoSubCategoriaLugar(List<SubCategoriaLugar> listaTipoSubCategoriaLugar) {
		this.listaTipoSubCategoriaLugar = listaTipoSubCategoriaLugar;
	}
}
