package com.cine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.model.Funcion;
import com.cine.repository.IFuncionRepo;

@Service
public class FuncionServiImpl implements IFuncionServi {

	@Autowired
	private IFuncionRepo funcionRepo;
	
	@Override
	public Funcion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.funcionRepo.buscar(id);
	}

	@Override
	public List<Funcion> buscarTodos() {
		// TODO Auto-generated method stub
		return this.funcionRepo.buscarTodos();
	}

	@Override
	public void insertar(Funcion funcion) {
		// TODO Auto-generated method stub
		this.funcionRepo.insertar(funcion);
	}

	@Override
	public void actualizar(Funcion funcion) {
		// TODO Auto-generated method stub
		this.funcionRepo.actualizar(funcion);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.eliminar(id);
	}



}
