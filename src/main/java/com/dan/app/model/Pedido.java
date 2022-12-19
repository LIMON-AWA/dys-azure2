package com.dan.app.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Pedido")
    private Integer idPedido;
    @Column(name = "NO_Pedido")
    private int nOPedido;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "producto")
    private String producto;
    @Column(name = "Precio")
    private int precio;

    public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Integer idPedido, int nOPedido, Date fecha, int cantidad, String producto, int precio) {
		super();
		this.idPedido = idPedido;
		this.nOPedido = nOPedido;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.producto = producto;
		this.precio = precio;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public int getnOPedido() {
		return nOPedido;
	}

	public void setnOPedido(int nOPedido) {
		this.nOPedido = nOPedido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", nOPedido=" + nOPedido + ", fecha=" + fecha + ", cantidad=" + cantidad
				+ ", producto=" + producto + ", precio=" + precio + "]";
	}
    
}
