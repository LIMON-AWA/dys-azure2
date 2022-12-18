package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Compra;
import com.dan.app.serviceInterface.ICompraService;

@Controller
@RequestMapping
public class CompraController {

	@Autowired
	private ICompraService service;
	
	@GetMapping("/listarCompra")
	public String listar(Model model) {
		model.addAttribute("Compra", service.listar());
		return "pages/Administrador/Compra/ListCompra";
	}
	@GetMapping("/listarCompra/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("Compra", service.listarId(id));
		return "pages/Administrador/Compra/AddCompra";
	}
	
	@GetMapping("/newCompra")
	public String nuevo(Model model) {
		model.addAttribute("Compra", new Compra());
		return "pages/Administrador/Compra/AddCompra";
	}
	
	@PostMapping("/saveCompra")
	public String save(@Validated Compra c,Model model) {
		int id=service.save(c);
		if(id==0) {
			return "AddCompra";
		}
		return "redirect:/listarCompra";
	}
	
	@GetMapping("/deleteCompra/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarCompra";
	}
}
