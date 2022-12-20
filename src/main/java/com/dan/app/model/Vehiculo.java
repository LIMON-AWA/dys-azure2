package com.dan.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdVehiculo")
    private Integer idVehiculo;
    @Column(name = "NoVehiculo")
    private int noVehiculo;
    @Column(name = "TipoVehiculoFK")
    private String tipoVehiculoFK;
    @Column(name = "Marca")
    private String marca;
    @Column(name = "Placa")
    private String placa;

    public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

	public Vehiculo(Integer idVehiculo, int noVehiculo, String tipoVehiculoFK, String marca, String placa) {
		super();
		this.idVehiculo = idVehiculo;
		this.noVehiculo = noVehiculo;
		this.tipoVehiculoFK = tipoVehiculoFK;
		this.marca = marca;
		this.placa = placa;
	}

	public Integer getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(Integer idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public int getNoVehiculo() {
		return noVehiculo;
	}

	public void setNoVehiculo(int noVehiculo) {
		this.noVehiculo = noVehiculo;
	}

	public String getTipoVehiculoFK() {
		return tipoVehiculoFK;
	}

	public void setTipoVehiculoFK(String tipoVehiculoFK) {
		this.tipoVehiculoFK = tipoVehiculoFK;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", noVehiculo=" + noVehiculo + ", tipoVehiculoFK="
				+ tipoVehiculoFK + ", marca=" + marca + ", placa=" + placa + "]";
	}
    
}
