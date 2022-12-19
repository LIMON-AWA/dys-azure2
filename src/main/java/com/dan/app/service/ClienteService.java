package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Cliente;
import com.dan.app.modelDAO.ICliente;
import com.dan.app.serviceInterface.IClienteService;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private ICliente dao;
	
	@Override
	public List<Cliente> listar() {
		return (List<Cliente>) dao.findAll();
	}

	@Override
	public Optional<Cliente> listarId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public int save(Cliente c) {
		int res=0;
		Cliente per=dao.save(c);
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
