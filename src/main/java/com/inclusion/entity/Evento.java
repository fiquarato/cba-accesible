package com.inclusion.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.inclusion.entity.serializer.LocalDateTimeCustomDeserializer;
import com.inclusion.entity.serializer.LocalDateTimeCustomSerializer;

@Entity
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull
	@Column(unique = true)
	private String nombre;
	private String descripcion;
	@JsonSerialize(using = LocalDateTimeCustomSerializer.class)
	@JsonDeserialize(using = LocalDateTimeCustomDeserializer.class)
	private LocalDate fechaEvento;
	private String precio;
	@ManyToOne
	@JoinColumn(name = "direccionId")
	private Direccion direccion;
	private String sitioWeb;
	private String facebook;
	private String urlFoto;
	@ManyToMany(targetEntity = TipoDiscapacidad.class, cascade = CascadeType.MERGE)
	@JoinTable(name = "evento_tipoDiscapacidad", 
				joinColumns = @JoinColumn(name = "eventoId"), 
				inverseJoinColumns = @JoinColumn(name = "tipoDiscapacidadId"))
	private List<TipoDiscapacidad> listaTiposDiscapacidad;
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
	public LocalDate getFechaEvento() {
		return fechaEvento;
	}
	public void setFechaEvento(LocalDate fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getSitioWeb() {
		return sitioWeb;
	}
	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getUrlFoto() {
		return urlFoto;
	}
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	public List<TipoDiscapacidad> getListaTiposDiscapacidad() {
		return listaTiposDiscapacidad;
	}
	public void setListaTiposDiscapacidad(List<TipoDiscapacidad> listaTiposDiscapacidad) {
		this.listaTiposDiscapacidad = listaTiposDiscapacidad;
	}
}
