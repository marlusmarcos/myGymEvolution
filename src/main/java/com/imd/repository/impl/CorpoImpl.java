package com.imd.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.imd.model.Corpo;
import com.imd.repository.ICorpo;

@Component
public class CorpoImpl implements ICorpo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Override
	public void addCorpo(Corpo c) {
		entityManager.merge(c);		
	}

	@Override
	public Corpo buscarCorpo(Long id) {
		return entityManager.find(Corpo.class, id);
	}

	@Override
	public List<Corpo> buscarTodos() {
		return entityManager.createQuery("from Corpo", Corpo.class).getResultList();
	}

}
