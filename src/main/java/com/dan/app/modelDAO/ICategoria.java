package com.dan.app.modelDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dan.app.model.Categoria;

@Repository
public interface ICategoria extends CrudRepository <Categoria, Integer>{
}
