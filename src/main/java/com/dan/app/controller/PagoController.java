package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Pago;
import com.dan.app.serviceInterface.IPagoServicio;

@Controller
@RequestMapping
public class PagoController {

	@Autowired
	private IPagoServicio service;
	
	@GetMapping("/listarPago")
	public String listar(Model model) {
		model.addAttribute("Pago", service.listar());
		return "pages/Administrador/Pago/ListPago";
	}
	@GetMapping("/listarPago/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("Pago", service.listarId(id));
		return "pages/Administrador/Pago/AddPago";
	}
	
	@GetMapping("/newPago")
	public String nuevo(Model model) {
		model.addAttribute("Pago", new Pago());
		return "pages/Administrador/Pago/AddPago";
	}
	
	@PostMapping("/savePago")
	public String save(@Validated Pago p,Model model) {
		int id=service.save(p);
		if(id==0) {
			return "AddPago";
		}
		return "redirect:/listarPago";
	}
	
	@GetMapping("/deletePago/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarPago";
	}
}
