package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.DetalleCompra;
import com.dan.app.serviceInterface.IDetalleCompraService;

@Controller
@RequestMapping
public class DetalleCompraController {

	@Autowired
	private IDetalleCompraService service;
	
	@GetMapping("/listarDetalleCompra")
	public String listar(Model model) {
		model.addAttribute("DetalleCompra", service.listar());
		return "pages/Administrador/DetalleCompra/ListDetalleCompra";
	}
	@GetMapping("/listarDetalleCompra/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("DetalleCompra", service.listarId(id));
		return "pages/Administrador/DetalleCompra/AddDetalleCompra";
	}
	
	@GetMapping("/newDetalleCompra")
	public String nuevo(Model model) {
		model.addAttribute("DetalleCompra", new DetalleCompra());
		return "pages/Administrador/DetalleCompra/AddDetalleCompra";
	}
	
	@PostMapping("/saveDetalleCompra")
	public String save(@Validated DetalleCompra d,Model model) {
		int id=service.save(d);
		if(id==0) {
			return "AddDetalleCompra";
		}
		return "redirect:/listarDetalleCompra";
	}
	
	@GetMapping("/deleteDetalleCompra/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarDetalleCompra";
	}
}
