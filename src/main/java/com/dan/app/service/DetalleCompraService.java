package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.DetalleCompra;
import com.dan.app.modelDAO.IDetalleCompra;
import com.dan.app.serviceInterface.IDetalleCompraService;

@Service
public class DetalleCompraService implements IDetalleCompraService{

	@Autowired
	private IDetalleCompra dao;
	
	@Override
	public List<DetalleCompra> listar() {
		return (List<DetalleCompra>) dao.findAll();
	}

	@Override
	public Optional<DetalleCompra> listarId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public int save(DetalleCompra d) {
		int res=0;
		DetalleCompra per=dao.save(d);
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
