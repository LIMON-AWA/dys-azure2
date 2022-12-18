package com.dan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dan.app.model.Vehiculo;
import com.dan.app.serviceInterface.IVehiculoService;

@Controller
@RequestMapping
public class VehiculoController {

	@Autowired
	private IVehiculoService service;
	
	@GetMapping("/listarVehiculo")
	public String listar(Model model) {
		model.addAttribute("Vehiculo", service.listar());
		return "pages/Administrador/Vehiculo/ListVehiculo";
	}
	@GetMapping("/listarVehiculo/{id}")
	public String listarId(@PathVariable int id,Model model) {
		model.addAttribute("Vehiculo", service.listarId(id));
		return "pages/Administrador/Vehiculo/AddVehiculo";
	}
	
	@GetMapping("/newVehiculo")
	public String nuevo(Model model) {
		model.addAttribute("Vehiculo", new Vehiculo());
		return "pages/Administrador/Vehiculo/AddVehiculo";
	}
	
	@PostMapping("/saveVehiculo")
	public String save(@Validated Vehiculo v,Model model) {
		int id=service.save(v);
		if(id==0) {
			return "AddVehiculo";
		}
		return "redirect:/listarVehiculo";
	}
	
	@GetMapping("/deleteVehiculo/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/listarVehiculo";
	}
}
