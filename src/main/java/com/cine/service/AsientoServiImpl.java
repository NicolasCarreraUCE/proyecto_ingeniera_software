package com.cine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.model.Asiento;
import com.cine.repository.IAsientoRepo;

@Service
public class AsientoServiImpl implements IAsientoServi {

	@Autowired
	private IAsientoRepo asientoRepo;
	
	@Override
	public Asiento buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.asientoRepo.buscar(id);
	}

	@Override
	public List<Asiento> buscarTodos() {
		// TODO Auto-generated method stub
		return this.asientoRepo.buscarTodos();
	}

	@Override
	public void insertar(Asiento asiento) {
		// TODO Auto-generated method stub
		this.asientoRepo.insertar(asiento);
	}

	@Override
	public void actualizar(Asiento asiento) {
		// TODO Auto-generated method stub
		this.asientoRepo.actualizar(asiento);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.asientoRepo.eliminar(id);
	}

}
