package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Proveedor;
import com.dan.app.serviceInterface.IProveedorServicio;

@Controller
@RequestMapping
public class ProveedorController {

	@Autowired
	private IProveedorServicio service;
	
	@GetMapping("/listarProveedor")
	public String listar(Model model) {
		model.addAttribute("Proveedor", service.listar());
		return "pages/Administrador/Proveedor/ListProveedor";
	}
	@GetMapping("/listarProveedor/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("Proveedor", service.listarId(id));
		return "pages/Administrador/Proveedor/AddProveedor";
	}
	
	@GetMapping("/newProveedor")
	public String nuevo(Model model) {
		model.addAttribute("Proveedor", new Proveedor());
		return "pages/Administrador/Proveedor/AddProveedor";
	}
	
	@PostMapping("/saveProveedor")
	public String save(@Validated Proveedor p,Model model) {
		int id=service.save(p);
		if(id==0) {
			return "AddProveedor";
		}
		return "redirect:/listarProveedor";
	}
	
	@GetMapping("/deleteProveedor/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarProveedor";
	}
	
}
