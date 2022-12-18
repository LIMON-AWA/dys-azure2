package com.dan.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	@GetMapping("pages/Dashboard")
	public String Dashboard(Model model) {
		return "pages/Dashboard";
	}
	
	@GetMapping("/venta")
	public String venta(Model model) {
		return "/venta";
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

	@GetMapping(path = "pages/Email")
	public String Email(Model model) {
		return "pages/Email";
	}
	
	@GetMapping(path = "pages/login")
	public String login(Model model) {
		return "pages/login";
	}
	
	@GetMapping(path = "pages/Chat")
	public String Chat(Model model) {
		return "pages/Chat";
	}
}
