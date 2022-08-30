package com.cine.repository;

import java.util.List;

import com.cine.model.Funcion;

public interface IFuncionRepo {
	Funcion buscar(Integer id);
	List<Funcion> buscarTodos();
	void insertar(Funcion funcion);
	void actualizar(Funcion funcion);
	void eliminar(Integer id);
}
