package com.cine.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cine.model.Usuario;

@Repository
@Transactional
public class UsuarioRepoImpl implements IUsuarioRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Usuario buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Usuario.class, id);
	}

	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery<Usuario> myQuery = this.entityManager.createQuery("SELECT e FROM Usuario e", Usuario.class);
		return myQuery.getResultList();
	}

	@Override
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(usuario);
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(usuario);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

	@Override
	public Usuario findByUsername(String username) {
		// TODO Auto-generated method stub
		TypedQuery<Usuario> myQuery = this.entityManager.createQuery("SELECT c FROM Usuario c WHERE c.username =:username", Usuario.class);
		myQuery.setParameter("username", username);
		return myQuery.getSingleResult();
	}

}
