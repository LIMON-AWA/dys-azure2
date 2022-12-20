package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Compra;

public interface ICompraService {

	public List<Compra> listar();
	public Optional<Compra> listarId(Integer id);
	public int save(Compra c);
	public void delete(Integer id);
}
