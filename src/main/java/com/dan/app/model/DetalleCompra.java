package com.dan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_compra")
public class DetalleCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Detalle")
    private Integer idDetalle;
    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "stock")
    private int stock;

    public DetalleCompra() {
		// TODO Auto-generated constructor stub
	}

	public DetalleCompra(Integer idDetalle, int cantidad, int stock) {
		super();
		this.idDetalle = idDetalle;
		this.cantidad = cantidad;
		this.stock = stock;
	}

	public Integer getIdDetalle() {
		return idDetalle;
	}

	public void setIdDetalle(Integer idDetalle) {
		this.idDetalle = idDetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "DetalleCompra [idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", stock=" + stock + "]";
	}
    
}
