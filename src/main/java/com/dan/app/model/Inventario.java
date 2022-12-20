package com.dan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Inventario")
    private Integer idInventario;
    @Column(name = "Stock")
    private int stock;
    @Column(name = "Movimiento")
    private Integer movimiento;
    @Column(name = "Cantidad")
    private int cantidad;

    public Inventario() {
		// TODO Auto-generated constructor stub
	}

	public Inventario(Integer idInventario, int stock, Integer movimiento, int cantidad) {
		super();
		this.idInventario = idInventario;
		this.stock = stock;
		this.movimiento = movimiento;
		this.cantidad = cantidad;
	}

	public Integer getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(Integer idInventario) {
		this.idInventario = idInventario;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Integer getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(Integer movimiento) {
		this.movimiento = movimiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Inventario [idInventario=" + idInventario + ", stock=" + stock + ", movimiento=" + movimiento
				+ ", cantidad=" + cantidad + "]";
	}
    
}
