package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Categoria;

public interface ICategoriaService {

	public List<Categoria> listar();
	public Optional<Categoria> listarId(int id);
	public int save(Categoria c);
	public void delete(int id);
}

