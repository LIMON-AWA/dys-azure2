package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Proveedor;
import com.dan.app.modelDAO.IProveedor;
import com.dan.app.serviceInterface.IProveedorServicio;

@Service
public class ProveedorService implements IProveedorServicio{

	@Autowired
	private IProveedor dao;
	
	@Override
	public List<Proveedor> listar() {
		return (List<Proveedor>) dao.findAll();
	}

	@Override
	public Optional<Proveedor> listarId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public int save(Proveedor p) {
		int res=0;
		Proveedor per=dao.save(p);
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
