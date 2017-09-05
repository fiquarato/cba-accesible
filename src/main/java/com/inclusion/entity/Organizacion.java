package com.inclusion.entity;

import javax.persistence.*;

import javax.validation.constraints.NotNull;

@Entity	
public class Organizacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull
	@Column(unique = true)
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "direccionId")
	private Direccion direccion;
	private String sitioWeb;
	private String telefono;
	private String telefonoAuxiliar;
	@OneToOne
	private Persona personaRepresentante;
	@OneToOne
	private Lugar lugar;
	
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTelefonoAuxiliar() {
		return telefonoAuxiliar;
	}
	public void setTelefonoAuxiliar(String telefonoAuxiliar) {
		this.telefonoAuxiliar = telefonoAuxiliar;
	}
	public Persona getPersonaRepresentante() {
		return personaRepresentante;
	}
	public void setPersonaRepresentante(Persona personaRepresentante) {
		this.personaRepresentante = personaRepresentante;
	}
	public Lugar getLugar() {
		return lugar;
	}
	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}	
}
