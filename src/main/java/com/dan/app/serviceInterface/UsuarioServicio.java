package com.dan.app.serviceInterface;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.dan.app.model.UsuarioRegistroDTO;
import com.dan.app.model.Usuario;


public interface UsuarioServicio extends UserDetailsService{

	public Usuario guardar(UsuarioRegistroDTO registroDTO);
	
	public List<Usuario> listarUsuarios();
	
}
