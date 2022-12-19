package com.dan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "categorias")
public class Categoria{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Idcategoria;

    @Column
    private String Descripcion;
    
    public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public Categoria(int idcategoria, String descripcion) {
		super();
		Idcategoria = idcategoria;
		Descripcion = descripcion;
	}

	public int getIdcategoria() {
		return Idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		Idcategoria = idcategoria;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categoria [Idcategoria=" + Idcategoria + ", Descripcion=" + Descripcion + "]";
	}  
    
}
