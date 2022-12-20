package com.dan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "domicilio")
public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Domicilio")
    private Integer idDomicilio;
    @Column(name = "NO_Domicilio")
    private int nODomicilio;
    @Column(name = "Producto")
    private String producto;
    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "Precio")
    private int precio;

    public Domicilio() {
		// TODO Auto-generated constructor stub
	}

	public Domicilio(Integer idDomicilio, int nODomicilio, String producto, int cantidad, int precio) {
		super();
		this.idDomicilio = idDomicilio;
		this.nODomicilio = nODomicilio;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Integer getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public int getnODomicilio() {
		return nODomicilio;
	}

	public void setnODomicilio(int nODomicilio) {
		this.nODomicilio = nODomicilio;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Domicilio [idDomicilio=" + idDomicilio + ", nODomicilio=" + nODomicilio + ", producto=" + producto
				+ ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
    
}
