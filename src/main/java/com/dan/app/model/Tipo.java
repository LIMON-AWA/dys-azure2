package com.dan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo")
public class Tipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IdTipo")
	private Integer idTipo;
	@Column(name = "NombreTipo")
	private String nombreTipo;

	public Tipo() {
		// TODO Auto-generated constructor stub
	}

	public Tipo(Integer idTipo, String nombreTipo) {
		super();
		this.idTipo = idTipo;
		this.nombreTipo = nombreTipo;
	}

	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public String getNombreTipo() {
		return nombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	@Override
	public String toString() {
		return "Tipo [idTipo=" + idTipo + ", nombreTipo=" + nombreTipo + "]";
	}

}
