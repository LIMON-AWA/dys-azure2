package com.dan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dan.app.model.Contacto;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer>{

	Contacto getById(Integer id);

}
