package com.dan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dan.app.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

	static Producto findFirstByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}
}
