package com.dan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "domiciliario")
public class Domiciliario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_domiciliario")
    private Integer iddomiciliario;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Telefono")
    private int telefono;
    @Column(name = "Correo")
    private String correo;

    public Domiciliario() {
		// TODO Auto-generated constructor stub
	}

	public Domiciliario(Integer iddomiciliario, String nombre, String apellido, int telefono, String correo) {
		super();
		this.iddomiciliario = iddomiciliario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
	}

	public Integer getIddomiciliario() {
		return iddomiciliario;
	}

	public void setIddomiciliario(Integer iddomiciliario) {
		this.iddomiciliario = iddomiciliario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Domiciliario [iddomiciliario=" + iddomiciliario + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", telefono=" + telefono + ", correo=" + correo + "]";
	}
 
}

