package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Domicilio;

public interface IDomicilioService {

	public List<Domicilio> listar();
	public Optional<Domicilio> listarId(Integer id);
	public int save(Domicilio d);
	public void delete(Integer id);
}
