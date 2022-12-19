package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Domicilio;
import com.dan.app.modelDAO.IDomicilio;
import com.dan.app.serviceInterface.IDomicilioService;

@Service
public class DomicilioService implements IDomicilioService{

	@Autowired
	private IDomicilio dao;
	
	@Override
	public List<Domicilio> listar() {
		return (List<Domicilio>) dao.findAll();
	}

	@Override
	public Optional<Domicilio> listarId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public int save(Domicilio d) {
		int res=0;
		Domicilio per=dao.save(d);
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
