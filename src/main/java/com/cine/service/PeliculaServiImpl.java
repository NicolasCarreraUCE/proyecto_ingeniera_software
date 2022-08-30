package com.cine.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cine.model.Pelicula;
import com.cine.repository.IPeliculaRepo;

@Service
public class PeliculaServiImpl implements IPeliculaServi {

	@Autowired
	private IPeliculaRepo peliculaRepo;
	
	@Override
	public Pelicula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.peliculaRepo.buscar(id);
	}

	@Override
	public List<Pelicula> buscarTodos() {
		// TODO Auto-generated method stub
		return this.peliculaRepo.buscarTodos();
	}

	@Override
	public void insertar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.peliculaRepo.insertar(pelicula);
	}

	@Override
	public void actualizar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.peliculaRepo.actualizar(pelicula);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.peliculaRepo.eliminar(id);
	}

//	@Override
//	public String saveImage(MultipartFile file) {
//		// TODO Auto-generated method stub
//		String ruta = "";
//		if(!file.isEmpty()) {
//			byte[] bytes;
//			try {
//				bytes = file.getBytes();
//				String nombre = new SimpleDateFormat("ddMyyyhhmmss").format(new Date()) + new Random().nextLong() + file.getOriginalFilename();
//				Path path = Paths.get(".//src//main//resources//static//imagenes//" + nombre);
//				//String tipo = file.getContentType();
//				Files.write(path, bytes);
//				ruta = "/imagenes/" + nombre;
//			} catch (IOException ex) {
//				// TODO: handle exception
//				ruta = "";
//			}
//		}
//		return ruta;
//	}
	
}
