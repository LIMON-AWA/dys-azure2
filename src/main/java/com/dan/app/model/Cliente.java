package com.dan.app.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Column(name = "Dni")
    private String dni;
    @Column(name = "Nombres")
    private String nombres;
    @Column(name = "Direccion")
    private String direccion;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;

    public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer idCliente, String dni, String nombres, String direccion, String email, String password) {
		super();
		this.idCliente = idCliente;
		this.dni = dni;
		this.nombres = nombres;
		this.direccion = direccion;
		this.email = email;
		this.password = password;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", dni=" + dni + ", nombres=" + nombres + ", direccion=" + direccion
				+ ", email=" + email + ", password=" + password + "]";
	}
    
}
