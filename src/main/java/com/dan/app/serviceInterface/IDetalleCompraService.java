package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.DetalleCompra;

public interface IDetalleCompraService {

	public List<DetalleCompra> listar();
	public Optional<DetalleCompra> listarId(Integer id);
	public int save(DetalleCompra d);
	public void delete(Integer id);
}
