package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Registrartarjeta;
import com.dan.app.serviceInterface.IRegistrarTarjetaService;

@Controller
@RequestMapping
public class RegistrarTarjetaController {

	@Autowired
	private IRegistrarTarjetaService service;
	
	@GetMapping("/listarRegistrarTarjeta")
	public String listar(Model model) {
		model.addAttribute("RegistrarTarjeta", service.listar());
		return "pages/Administrador/RegistrarTarjeta/ListRegistrarTarjeta";
	}
	@GetMapping("/listarRegistrarTarjeta/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("RegistrarTarjeta", service.listarId(id));
		return "pages/Administrador/RegistrarTarjeta/AddRegistrarTarjeta";
	}
	
	@GetMapping("/newRegistrarTarjeta")
	public String nuevo(Model model) {
		model.addAttribute("RegistrarTarjeta", new Registrartarjeta());
		return "pages/Administrador/RegistrarTarjeta/AddRegistrarTarjeta";
	}
	
	@PostMapping("/saveRegistrarTarjeta")
	public String save(@Validated Registrartarjeta r,Model model) {
		int id=service.save(r);
		if(id==0) {
			return "AddRegistrarTarjeta";
		}
		return "redirect:/listarRegistrarTarjeta";
	}
	
	@GetMapping("/deleteRegistrarTarjeta/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarRegistrarTarjeta";
	}
	
}
