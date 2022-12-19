package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Domicilio;
import com.dan.app.serviceInterface.IDomicilioService;

@Controller
@RequestMapping
public class DomicilioController {

	@Autowired
	private IDomicilioService service;
	
	@GetMapping("/listarDomicilio")
	public String listar(Model model) {
		model.addAttribute("Domicilio", service.listar());
		return "pages/Administrador/Domicilio/ListDomicilio";
	}
	@GetMapping("/listarDomicilio/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("Domicilio", service.listarId(id));
		return "pages/Administrador/Domicilio/AddDomicilio";
	}
	
	@GetMapping("/newDomicilio")
	public String nuevo(Model model) {
		model.addAttribute("Domicilio", new Domicilio());
		return "pages/Administrador/Domicilio/AddDomicilio";
	}
	
	@PostMapping("/saveDomicilio")
	public String save(@Validated Domicilio d,Model model) {
		int id=service.save(d);
		if(id==0) {
			return "AddDomicilio";
		}
		return "redirect:/listarDomicilio";
	}
	
	@GetMapping("/deleteDomicilio/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarDomicilio";
	}

}
