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
	@NotNull
	private String calle;
	@NotNull
	private int numeroCalle;
	private String departamentoCalle;
	private int codigoPostal;
	private String telefono;
	private String telefonoAuxiliar;
	private Double latitud;
	private Double longitud;
	private String email;
	private String sitioWeb;
	@ElementCollection(targetClass = TipoDiscapacidad.class, fetch = FetchType.EAGER)
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
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumeroCalle() {
		return numeroCalle;
	}
	public void setNumeroCalle(int numeroCalle) {
		this.numeroCalle = numeroCalle;
	}
	public String getDepartamentoCalle() {
		return departamentoCalle;
	}
	public void setDepartamentoCalle(String departamentoCalle) {
		this.departamentoCalle = departamentoCalle;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
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
	public Double getLatitud() {
		return latitud;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
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
}