package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Tipo;

public interface ITipoService {

	public List<Tipo> listar();
	public Optional<Tipo> listarId(Integer id);
	public int save(Tipo t);
	public void delete(Integer id);
}
