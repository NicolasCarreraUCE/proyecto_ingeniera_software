package com.cine.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cine.model.Asiento;

@Repository
@Transactional
public class AsientoRepoImpl implements IAsientoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Asiento buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Asiento.class, id);
	}

	@Override
	public List<Asiento> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Asiento> myQuery = this.entityManager.createQuery("SELECT e FROM Asiento e", Asiento.class);
		return myQuery.getResultList();
	}

	@Override
	public void insertar(Asiento asiento) {
		// TODO Auto-generated method stub
		this.entityManager.merge(asiento);
	}

	@Override
	public void actualizar(Asiento asiento) {
		// TODO Auto-generated method stub
		this.entityManager.merge(asiento);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}
	
}
