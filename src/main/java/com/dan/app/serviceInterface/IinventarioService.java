package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Inventario;

public interface IinventarioService {

	public List<Inventario> listar();
	public Optional<Inventario> listarId(Integer id);
	public int save(Inventario i);
	public void delete(Integer id);
}