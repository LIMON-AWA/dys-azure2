package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Vehiculo;

public interface IVehiculoService {

	public List<Vehiculo> listar();
	public Optional<Vehiculo> listarId(Integer id);
	public int save(Vehiculo v);
	public void delete(Integer id);
}
