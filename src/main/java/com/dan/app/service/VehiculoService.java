package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Vehiculo;
import com.dan.app.modelDAO.IVehiculo;
import com.dan.app.serviceInterface.IVehiculoService;

@Service
public class VehiculoService implements IVehiculoService{

	@Autowired
	private IVehiculo dao;
	
	@Override
	public List<Vehiculo> listar() {
		return (List<Vehiculo>) dao.findAll();
	}
	
	@Override
	public Optional<Vehiculo> listarId(Integer id) {
		return dao.findById(id);
	}
	
	@Override
	public int save(Vehiculo v) {
		int res=0;
		Vehiculo per=dao.save(v);
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
