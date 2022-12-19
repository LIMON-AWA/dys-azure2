package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Domiciliario;
import com.dan.app.modelDAO.IDomiciliario;
import com.dan.app.serviceInterface.IDomiciliarioService;

@Service
public class DomiciliarioService implements IDomiciliarioService{

	@Autowired
	private IDomiciliario dao;
	
	@Override
	public List<Domiciliario> listar() {
		return (List<Domiciliario>) dao.findAll();
	}

	@Override
	public Optional<Domiciliario> listarId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public int save(Domiciliario d) {
		int res=0;
		Domiciliario per=dao.save(d);
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
