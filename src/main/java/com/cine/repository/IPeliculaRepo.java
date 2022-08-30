package com.cine.repository;

import java.util.List;

import com.cine.model.Pelicula;

public interface IPeliculaRepo {
	Pelicula buscar(Integer id);
	List<Pelicula> buscarTodos();
	void insertar(Pelicula pelicula);
	void actualizar(Pelicula pelicula);
	void eliminar(Integer id);
}
