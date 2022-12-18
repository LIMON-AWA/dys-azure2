package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Cliente;
import com.dan.app.serviceInterface.IClienteService;

@Controller
@RequestMapping
public class ClienteController {

	@Autowired
	private IClienteService service;
	
	@GetMapping("/listarCliente")
	public String listar(Model model) {
		model.addAttribute("Cliente", service.listar());
		return "pages/Administrador/Cliente/ListCliente";
	}
	@GetMapping("/listarCliente/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("Cliente", service.listarId(id));
		return "pages/Administrador/Cliente/AddCliente";
	}
	
	@GetMapping("/newCliente")
	public String nuevo(Model model) {
		model.addAttribute("Cliente", new Cliente());
		return "pages/Administrador/Cliente/AddCliente";
	}
	
	@PostMapping("/saveCliente")
	public String save(@Validated Cliente c,Model model) {
		int id=service.save(c);
		if(id==0) {
			return "AddCliente";
		}
		return "redirect:/listarCliente";
	}
	
	@GetMapping("/deleteCliente/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarCliente";
	}
	
}
