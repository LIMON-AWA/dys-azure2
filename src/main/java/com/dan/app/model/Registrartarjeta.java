package com.dan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registrartarjeta")
public class Registrartarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NumeroTarjeta")
    private Integer numeroTarjeta;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Expiracion")
    private int expiracion;
    @Column(name = "ano")
    private int ano;
    @Column(name = "CCV")
    private int ccv;

    public Registrartarjeta() {
		// TODO Auto-generated constructor stub
	}

	public Registrartarjeta(Integer numeroTarjeta, String nombre, int expiracion, int ano, int ccv) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.nombre = nombre;
		this.expiracion = expiracion;
		this.ano = ano;
		this.ccv = ccv;
	}

	public Integer getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(Integer numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExpiracion() {
		return expiracion;
	}

	public void setExpiracion(int expiracion) {
		this.expiracion = expiracion;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getCcv() {
		return ccv;
	}

	public void setCcv(int ccv) {
		this.ccv = ccv;
	}

	@Override
	public String toString() {
		return "Registrartarjeta [numeroTarjeta=" + numeroTarjeta + ", nombre=" + nombre + ", expiracion=" + expiracion
				+ ", ano=" + ano + ", ccv=" + ccv + "]";
	}
    
}
