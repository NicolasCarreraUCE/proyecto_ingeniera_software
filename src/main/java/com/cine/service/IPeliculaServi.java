package com.cine.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cine.model.Pelicula;

public interface IPeliculaServi {
	Pelicula buscar(Integer id);
	List<Pelicula> buscarTodos();
	void insertar(Pelicula pelicula);
	void actualizar(Pelicula pelicula);
	void eliminar(Integer id);
	
	//String saveImage(MultipartFile file);
}
