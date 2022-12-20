package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Inventario;
import com.dan.app.serviceInterface.IinventarioService;

@Controller
@RequestMapping
public class InventarioController {

	@Autowired
	private IinventarioService service;
	
	@GetMapping("/listarInventario")
	public String listar(Model model) {
		model.addAttribute("inventario", service.listar());
		return "pages/Administrador/Inventario/Listinventario";
	}
	@GetMapping("/listarInventario/{id}")
	public String listarId(@PathVariable Integer id,Model model) {
		model.addAttribute("inventario", service.listarId(id));
		return "pages/Administrador/Inventario/AddInventario";
	}
	
	@GetMapping("/newInventario")
	public String nuevo(Model model) {
		model.addAttribute("inventario", new Inventario());
		return "pages/Administrador/Inventario/AddInventario";
	}
	
	@PostMapping("/saveInventario")
	public String save(@Validated Inventario i,Model model) {
		int id=service.save(i);
		if(id==0) {
			return "AddInventario";
		}
		return "redirect:/listarInventario";
	}
	
	@GetMapping("/deleteInventario/{id}")
	public String eliminar(@PathVariable Integer id,Model model) {
		service.delete(id);
		return "redirect:/listarInventario";
	}
	
}
