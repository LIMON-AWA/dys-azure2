package com.dan.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dan.app.model.Tipo;
import com.dan.app.modelDAO.ITipo;
import com.dan.app.serviceInterface.ITipoService;

@Service
public class TipoService implements ITipoService{

	@Autowired
	private ITipo dao;
	
	@Override
	public List<Tipo> listar() {
		return (List<Tipo>) dao.findAll();
	}
	
	@Override
	public Optional<Tipo> listarId(Integer id) {
		return dao.findById(id);
	}
	
	@Override
	public int save(Tipo t) {
		int res=0;
		Tipo per=dao.save(t);
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
