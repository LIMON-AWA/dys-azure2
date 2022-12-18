package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Cliente;

public interface IClienteService {
 
	public List<Cliente> listar();
	public Optional<Cliente> listarId(Integer id);
	public int save(Cliente c);
	public void delete(Integer id);
	
}
