package com.dan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Proveedor")
    private Integer idProveedor;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Correo")
    private String correo;
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Telefono")
    private int telefono;

    public Proveedor() {
		// TODO Auto-generated constructor stub
	}

	public Proveedor(Integer idProveedor, String nombre, String correo, String direccion, int telefono) {
		super();
		this.idProveedor = idProveedor;
		this.nombre = nombre;
		this.correo = correo;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + ", nombre=" + nombre + ", correo=" + correo + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}
    
}
