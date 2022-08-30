package com.cine.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cine.model.Funcion;

@Repository
@Transactional
public class FuncionRepoImpl implements IFuncionRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Funcion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Funcion.class, id);
	}

	@Override
	public List<Funcion> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Funcion> myQuery = this.entityManager.createQuery("SELECT e FROM Funcion e", Funcion.class);
		return myQuery.getResultList();
	}

	@Override
	public void insertar(Funcion funcion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(funcion);
	}

	@Override
	public void actualizar(Funcion funcion) {
		// TODO Auto-generated method stub
		this.entityManager.merge(funcion);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
