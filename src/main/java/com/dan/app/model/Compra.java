package com.dan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "compra")
public class Compra{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Compra")
    private Integer idCompra;
    @Column(name = "No_Compra")
    private Integer noCompra;
    @Column(name = "Cantidad")
    private Integer cantidad;
    @Column(name = "Stock")
    private Integer stock;

    public Compra() {
		// TODO Auto-generated constructor stub
	}

	public Compra(Integer idCompra, Integer noCompra, Integer cantidad, Integer stock) {
		super();
		this.idCompra = idCompra;
		this.noCompra = noCompra;
		this.cantidad = cantidad;
		this.stock = stock;
	}

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Integer getNoCompra() {
		return noCompra;
	}

	public void setNoCompra(Integer noCompra) {
		this.noCompra = noCompra;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Compra [idCompra=" + idCompra + ", noCompra=" + noCompra + ", cantidad=" + cantidad + ", stock=" + stock
				+ "]";
	}
    
}
