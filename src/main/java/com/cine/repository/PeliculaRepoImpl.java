package com.cine.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cine.model.Pelicula;

@Repository
@Transactional
public class PeliculaRepoImpl implements IPeliculaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Pelicula buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Pelicula.class, id);
	}

	@Override
	public List<Pelicula> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Pelicula> myQuery = this.entityManager.createQuery("SELECT e FROM Pelicula e", Pelicula.class);
		return myQuery.getResultList();
	}

	@Override
	public void insertar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pelicula);
	}

	@Override
	public void actualizar(Pelicula pelicula) {
		// TODO Auto-generated method stub
		this.entityManager.merge(pelicula);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
