package com.dan.app.model;

public class ProductoParaVender extends Producto {
    private Float cantidad1;

    public ProductoParaVender(Integer id, String nombre, String codigo, String descripcion, String imagen, double precio, int cantidad, Usuario usuario, Float cantidad1) {
        
        super(id, nombre, codigo, descripcion, imagen, precio, cantidad, usuario);
       
        this.cantidad1 = cantidad1;
    }

    public ProductoParaVender(String nombre, String codigo, double precio, int cantidad, Integer id, float cantidad1) {
		// TODO Auto-generated constructor stub
	}

	public void aumentarCantidad() {
        this.cantidad1++;
    }

    public Float getCantidad1() {
        return cantidad1;
    }

    public double getTotal() {
        return this.getPrecio() * this.getCantidad();
    }
}