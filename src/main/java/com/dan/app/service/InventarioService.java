package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Inventario;
import com.dan.app.modelDAO.Iinventario;
import com.dan.app.serviceInterface.IinventarioService;

@Service
public class InventarioService implements IinventarioService{

	@Autowired
	private Iinventario dao;
	
	@Override
	public List<Inventario> listar() {
		return (List<Inventario>) dao.findAll();
	}

	@Override
	public Optional<Inventario> listarId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public int save(Inventario i) {
		int res=0;
		Inventario per=dao.save(i);
		if(!per.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
		
	}
}
