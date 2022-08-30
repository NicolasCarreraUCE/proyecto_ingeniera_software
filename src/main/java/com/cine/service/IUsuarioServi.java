package com.cine.service;

import java.util.List;

import com.cine.model.Usuario;

public interface IUsuarioServi {
	Usuario buscar(Integer id);
	List<Usuario> buscarTodos();
	void insertar(Usuario usuario);
	void actualizar(Usuario usuario);
	void eliminar(Integer id);
	
	Usuario findByUsername(String username);
}
