package com.dan.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.dan.app.model.Categoria;
import com.dan.app.modelDAO.ICategoria;
import com.dan.app.serviceInterface.ICategoriaService;

@Service
public class CategoriaService implements ICategoriaService{

	@Autowired
	private ICategoria dao;
	
	@Override
	public List<Categoria> listar() {
		return (List<Categoria>) dao.findAll();
	}

	@Override
	public Optional<Categoria> listarId(int id) {
		return dao.findById(id);
	}

	@Override
	public int save(Categoria c) {
		int res=0;
		Categoria per=dao.save(c);
		if(!per.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		
	}
}
