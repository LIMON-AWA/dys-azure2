package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Pedido;

public interface IPedidoServicio {

	public List<Pedido> listar();
	public Optional<Pedido> listarId(Integer id);
	public int save(Pedido p);
	public void delete(Integer id);
}
