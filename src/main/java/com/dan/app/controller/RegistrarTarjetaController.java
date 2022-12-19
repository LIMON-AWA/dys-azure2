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
	
	@GetMapping("/listarTarjeta")
	public String listar(Model model) {
		model.addAttribute("RegistrarTarjeta", service.listar());
		return "pages/Administrador/RegistrarTarjeta/ListTarjeta";
	}
	@GetMapping("/editarTarjeta/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("RegistrarTarjeta", service.listarId(id));
		return "pages/Administrador/RegistrarTarjeta/tarjeta";
	}
	
	@GetMapping("/newTarjeta")
	public String nuevo(Model model) {
		model.addAttribute("RegistrarTarjeta", new Registrartarjeta());
		return "pages/Administrador/RegistrarTarjeta/tarjeta";
	}
	
	@PostMapping("/saveTarjeta")
	public String save(@Validated Registrartarjeta r,Model model) {
		int id=service.save(r);
		if(id==0) {
			return "tarjeta";
		}
		return "redirect:/listarTarjeta";
	}
	
	@GetMapping("/deleteTarjeta/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarTarjeta";
	}
	
}
