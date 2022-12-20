package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Compra;
import com.dan.app.modelDAO.ICompra;
import com.dan.app.serviceInterface.ICompraService;

@Service
public class CompraService implements ICompraService{

	@Autowired
	private ICompra dao;
	
	@Override
	public List<Compra> listar() {
		return (List<Compra>) dao.findAll();
	}

	@Override
	public Optional<Compra> listarId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public int save(Compra c) {
		int res=0;
		Compra per=dao.save(c);
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
