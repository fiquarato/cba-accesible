package com.inclusion.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	@Column(unique = true)
	private String email;
	@NotNull
	private String pass;
	@JsonIgnore
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	private Persona persona;
	private TipoUsuario tipoUsuario;

	public enum TipoUsuario {
		PERSONA, REPRESENTANTE, MODERADOR;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}
