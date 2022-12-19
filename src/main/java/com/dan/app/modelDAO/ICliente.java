package com.dan.app.modelDAO;

import org.springframework.data.repository.CrudRepository;

import com.dan.app.model.Cliente;

public interface ICliente extends CrudRepository <Cliente, Integer>{

}
