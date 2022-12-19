package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Domiciliario;

public interface IDomiciliarioService {

	public List<Domiciliario> listar();
	public Optional<Domiciliario> listarId(Integer id);
	public int save(Domiciliario d);
	public void delete(Integer id);
}
