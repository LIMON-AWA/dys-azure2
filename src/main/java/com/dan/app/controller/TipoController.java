package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Tipo;
import com.dan.app.serviceInterface.ITipoService;

@Controller
@RequestMapping
public class TipoController {

	@Autowired
	private ITipoService service;
	
	@GetMapping("/listarTipo")
	public String listar(Model model) {
		model.addAttribute("Tipo", service.listar());
		return "pages/Administrador/Tipo/ListTipo";
	}
	@GetMapping("/listarTipo/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("Tipo", service.listarId(id));
		return "pages/Administrador/Tipo/AddTipo";
	}
	
	@GetMapping("/newTipo")
	public String nuevo(Model model) {
		model.addAttribute("Tipo", new Tipo());
		return "pages/Administrador/Tipo/AddTipo";
	}
	
	@PostMapping("/saveTipo")
	public String save(@Validated Tipo t,Model model) {
		int id=service.save(t);
		if(id==0) {
			return "AddTipo";
		}
		return "redirect:/listarTipo";
	}
	
	@GetMapping("/deleteTipo/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarTipo";
	}
}
