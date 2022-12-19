package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Pedido;
import com.dan.app.serviceInterface.IPedidoServicio;

@Controller
@RequestMapping
public class PedidoController {

	@Autowired
	private IPedidoServicio service;
	
	@GetMapping("/listarPedido")
	public String listar(Model model) {
		model.addAttribute("Pedido", service.listar());
		return "pages/Administrador/Pedidos/ListPedidos";
	}
	@GetMapping("/editarPedido/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("Pedido", service.listarId(id));
		return "pages/Administrador/Pedidos/AddPedidos";
	}
	
	@GetMapping("/newPedido")
	public String nuevo(Model model) {
		model.addAttribute("Pedido", new Pedido());
		return "pages/Administrador/Pedidos/AddPedidos";
	}
	
	@PostMapping("/savePedido")
	public String save(@Validated Pedido p,Model model) {
		int id=service.save(p);
		if(id==0) {
			return "AddPedido";
		}
		return "redirect:/listarPedido";
	}
	
	@GetMapping("/deletePedido/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarPedido";
	}
	
}
