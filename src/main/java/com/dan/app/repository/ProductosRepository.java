package com.dan.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.dan.app.model.Producto;

public interface ProductosRepository extends CrudRepository<Producto, Integer> {

	Producto findFirstByCodigo(String codigo);
}
