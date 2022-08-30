package com.cine.repository;

import java.util.List;

import com.cine.model.Asiento;

public interface IAsientoRepo {
	Asiento buscar(Integer id);
	List<Asiento> buscarTodos();
	void insertar(Asiento asiento);
	void actualizar(Asiento asiento);
	void eliminar(Integer id);
}
