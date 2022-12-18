package com.dan.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.dan.app.model.Venta;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
}
