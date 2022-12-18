package com.dan.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AppController {
	
	@GetMapping("/Dashboard")
	public String Dashboard() {
		return "/Dashboard";
	}
	
	@GetMapping("/")
	public String index() {
		return "/index";
	}
	
	@GetMapping("/venta")
	public String venta() {
		return "/venta";
	}

	@GetMapping(path = "pages/contacto")
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

	@GetMapping(path = "/chat")
	public String chat() {
		return "/chat";
	}
	
	
	@GetMapping(path = "/login")
	public String login() {
		return "/login";
	}
}
