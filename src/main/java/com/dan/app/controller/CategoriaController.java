package com.dan.app.controller;

import java.io.ByteArrayInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.dan.app.model.Categoria;
import com.dan.app.serviceInterface.ICategoriaService;
import com.dan.app.modelDAO.ICategoria;

@Controller
@RequestMapping
public class CategoriaController {

	@Autowired
	private ICategoriaService service;
	
	@GetMapping("/listarCategoria")
	public String listar(Model model) {
		model.addAttribute("Categorias", service.listar());
		return "pages/Administrador/Categoria/ListCategoria";
	}
	
	@GetMapping("/editarCategoria/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("categoria", service.listarId(id));
		return "pages/Administrador/Categoria/AddCategoria";
	}
	
	@GetMapping("/newCategoria")
	public String nuevo(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "pages/Administrador/Categoria/AddCategoria";
	}
	
	@PostMapping("/saveCategoria")
	public String save(@Validated Categoria c,Model model) {
		int id=service.save(c);
		if(id==0) {
			return "AddCategoria";
		}
		return "redirect:/listarCategoria";
	}
	
	@GetMapping("/eliminarCategoria/{id}")
	public String delete(Model model,@PathVariable int id) {
		service.delete(id);
		return "redirect:/listarCategoria";
	}

}
