package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Pedido;
import com.dan.app.modelDAO.IPedido;
import com.dan.app.serviceInterface.IPedidoServicio;

@Service
public class PedidoService implements IPedidoServicio{

	@Autowired
	private IPedido dao;
	
	@Override
	public List<Pedido> listar() {
		return (List<Pedido>) dao.findAll();
	}

	@Override
	public Optional<Pedido> listarId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public int save(Pedido p) {
		int res=0;
		Pedido per=dao.save(p);
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
