package com.dan.app.serviceInterface;

import java.util.List;
import java.util.Optional;

import com.dan.app.model.Pago;

public interface IPagoServicio {

	public List<Pago> listar();
	public Optional<Pago> listarId(Integer id);
	public int save(Pago p);
	public void delete(Integer id);
}
