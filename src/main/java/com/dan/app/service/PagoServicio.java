package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Pago;
import com.dan.app.modelDAO.IPago;
import com.dan.app.serviceInterface.IPagoServicio;

@Service
public class PagoServicio implements IPagoServicio{

	@Autowired
	private IPago dao;
	
	@Override
	public List<Pago> listar() {
		return (List<Pago>) dao.findAll();
	}

	@Override
	public Optional<Pago> listarId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public int save(Pago p) {
		int res=0;
		Pago per=dao.save(p);
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
