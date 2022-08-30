package com.cine.service;

import java.util.List;

import com.cine.model.Asiento;

public interface IAsientoServi {
	Asiento buscar(Integer id);
	List<Asiento> buscarTodos();
	void insertar(Asiento asiento);
	void actualizar(Asiento asiento);
	void eliminar(Integer id);
}
