package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Registrartarjeta;
import com.dan.app.modelDAO.IRegistrarTarjeta;
import com.dan.app.serviceInterface.IRegistrarTarjetaService;

@Service
public class RegistrarTarjetaService implements IRegistrarTarjetaService{

	@Autowired
	private IRegistrarTarjeta dao;
	
	@Override
	public List<Registrartarjeta> listar() {
		return (List<Registrartarjeta>) dao.findAll();
	}

	@Override
	public Optional<Registrartarjeta> listarId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public int save(Registrartarjeta R) {
		int res=0;
		Registrartarjeta per=dao.save(R);
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
