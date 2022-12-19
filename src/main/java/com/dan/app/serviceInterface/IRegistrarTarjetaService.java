package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Registrartarjeta;

public interface IRegistrarTarjetaService {

	public List<Registrartarjeta> listar();
	public Optional<Registrartarjeta> listarId(Integer id);
	public int save(Registrartarjeta r);
	public void delete(Integer id);
}
