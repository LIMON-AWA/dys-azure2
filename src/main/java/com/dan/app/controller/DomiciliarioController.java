package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Domiciliario;
import com.dan.app.serviceInterface.IDomiciliarioService;

@Controller
@RequestMapping
public class DomiciliarioController {

	@Autowired
	private IDomiciliarioService service;
	
	@GetMapping("/listarDomiciliario")
	public String listar(Model model) {
		model.addAttribute("Domiciliario", service.listar());
		return "pages/Administrador/Domiciliario/ListDomiciliario";
	}
	@GetMapping("/editarDomiciliario/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("Domiciliario", service.listarId(id));
		return "pages/Administrador/Domiciliario/AddDomiciliario";
	}
	
	@GetMapping("/newDomiciliario")
	public String nuevo(Model model) {
		model.addAttribute("Domiciliario", new Domiciliario());
		return "pages/Administrador/Domiciliario/AddDomiciliario";
	}
	
	@PostMapping("/saveDomiciliario")
	public String save(@Validated Domiciliario d,Model model) {
		int id=service.save(d);
		if(id==0) {
			return "AddDomiciliario";
		}
		return "redirect:/listarDomiciliario";
	}
	
	@GetMapping("/deleteDomiciliario/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarDomiciliario";
	}
}
