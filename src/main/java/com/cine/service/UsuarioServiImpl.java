package com.cine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.model.Usuario;
import com.cine.repository.IUsuarioRepo;

@Service
public class UsuarioServiImpl implements IUsuarioServi {

	@Autowired
	private IUsuarioRepo usuarioRepo;
	
	@Override
	public Usuario buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.usuarioRepo.buscar(id);
	}

	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.usuarioRepo.buscarTodos();
	}

	@Override
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.usuarioRepo.insertar(usuario);;
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.usuarioRepo.actualizar(usuario);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.usuarioRepo.eliminar(id);
	}

	@Override
	public Usuario findByUsername(String username) {
		// TODO Auto-generated method stub
		return this.usuarioRepo.findByUsername(username);
	}
	
}
