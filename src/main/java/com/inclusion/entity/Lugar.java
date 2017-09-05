package com.inclusion.entity;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Lugar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@NotNull
	@Column(unique = true)
	private String nombre;
	private String descripcion;
	private String telefono;
	private String telefonoAuxiliar;
	private String email;
	private String sitioWeb;
	private String facebook;
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "direccionId")
	private Direccion direccion;
	@OneToOne
	private Organizacion organizacion;
	@ManyToMany(targetEntity = TipoDiscapacidad.class, cascade = CascadeType.MERGE)
	@JoinTable(name = "lugar_tipoDiscapacidad", 
				joinColumns = @JoinColumn(name = "lugarId"), 
				inverseJoinColumns = @JoinColumn(name = "tipoDiscapacidadId"))
	private List<TipoDiscapacidad> listaTiposDiscapacidad;
	@ManyToMany(targetEntity = SubCategoriaLugar.class, cascade = CascadeType.MERGE)
	@JoinTable(name = "lugar_subCategoriaLugar", 
				joinColumns = @JoinColumn(name = "lugarId"), 
				inverseJoinColumns = @JoinColumn(name = "subCategoriaLugarId"))
	private List<SubCategoriaLugar> listaSubCategoriasLugar;
	private String urlFoto;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSitioWeb() {
		return sitioWeb;
	}
	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}
	public List<TipoDiscapacidad> getListaTiposDiscapacidad() {
		return listaTiposDiscapacidad;
	}
	public void setListaTiposDiscapacidad(List<TipoDiscapacidad> listaTiposDiscapacidad) {
		this.listaTiposDiscapacidad = listaTiposDiscapacidad;
	}
	public List<SubCategoriaLugar> getListaSubCategoriasLugar() {
		return listaSubCategoriasLugar;
	}
	public void setListaSubCategoriasLugar(List<SubCategoriaLugar> listaSubCategoriasLugar) {
		this.listaSubCategoriasLugar = listaSubCategoriasLugar;
	}
	public String getUrlFoto() {
		return urlFoto;
	}
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Organizacion getOrganizacion() {
		return organizacion;
	}
	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}	
}