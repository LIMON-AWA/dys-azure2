package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Proveedor;

public interface IProveedorServicio {

	public List<Proveedor> listar();
	public Optional<Proveedor> listarId(Integer id);
	public int save(Proveedor p);
	public void delete(Integer id);
}
