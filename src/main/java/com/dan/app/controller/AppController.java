package com.dan.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("pages/Dashboard")
	public String Dashboard() {
		return "pages/Dashboard";
	}
	
	@GetMapping("pages/venta")
	public String venta() {
		return "pages/venta";
	}

	@GetMapping("pages/contacto")
	public String contacto() {
		return "pages/contacto";
	}

	@GetMapping(path = "pages/Nosotros")
	public String Nosotros() {
		return "pages/Nosotros";
	}

	@GetMapping(path = "pages/Tablas/CategoriaDash")
	public String CategoriaDash() {
		return "pages/Tablas/CategoriaDash";
	}
	
	@GetMapping(path = "pages/Tablas/PedidoDash")
	public String PedidoDash() {
		return "pages/Tablas/PedidoDash";
	}
	
	@GetMapping(path = "pages/Tablas/CompraDash")
	public String Compra() {
		return "pages/Tablas/CompraDash";
	}
	
	@GetMapping(path = "pages/Tablas/ClienteDash")
	public String Cliente() {
		return "pages/Tablas/ClienteDash";
	}

	@GetMapping(path = "pages/Tablas/InventarioDash")
	public String InventarioDash() {
		return "pages/Tablas/InventarioDash";
	}

	@GetMapping(path = "pages/Tablas/ProductoDash")
	public String ProductoDash() {
		return "pages/Tablas/ProductoDash";
	}

	@GetMapping(path = "pages/Tablas/RolDash")
	public String RolDash() {
		return "pages/Tablas/RolDash";
	}

	@GetMapping(path = "pages/Tablas/UsuarioDash")
	public String UsuarioDash() {
		return "pages/Tablas/UsuarioDash";
	}

	@GetMapping(path = "pages/Tablas/EmailDash")
	public String EmailDash() {
		return "pages/Tablas/EmailDash";
	}
	
	@GetMapping(path = "pages/Tablas/ContactoDash")
	public String Contacto() {
		return "pages/Tablas/ContactoDash";
	}
	
	@GetMapping(path = "pages/Tablas/DomiciliarioDash")
	public String Domiciliario() {
		return "pages/Tablas/DomiciliarioDash";
	}
	
	@GetMapping(path = "pages/Tablas/DashDomicilio")
	public String Domicilio() {
		return "pages/Tablas/DashDomicilio";
	}
	
	@GetMapping(path = "pages/Tablas/PagoDash")
	public String pago() {
		return "pages/Tablas/PagoDash";
	}

	@GetMapping(path = "pages/Tablas/ProveedorDash")
	public String proveedor() {
		return "pages/Tablas/ProveedorDash";
	}
	
	@GetMapping(path = "pages/Tablas/VehiculoDash")
	public String vehiculo() {
		return "pages/Tablas/VehiculoDash";
	}
	
	
	@GetMapping(path = "pages/Tablas/TarjetaDash")
	public String tarjeta() {
		return "pages/Tablas/TarjetaDash";
	}
	
	@GetMapping(path = "pages/Email")
	public String Email() {
		return "pages/Email";
	}
	
	@GetMapping(path = "pages/login")
	public String login() {
		return "pages/login";
	}
	
	@GetMapping(path = "pages/Chat")
	public String Chat() {
		return "pages/Chat";
	}
}
