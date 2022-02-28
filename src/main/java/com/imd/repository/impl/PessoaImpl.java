package com.imd.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.imd.model.Pessoa;
import com.imd.repository.IPessoa;

@Component
public class PessoaImpl implements IPessoa{
	
	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	@Transactional
	public void addPessoa(Pessoa p) {
		entitymanager.merge(p);		
	}

	@Override
	public Pessoa buscarPessoa(Long id) {
		return entitymanager.find(Pessoa.class, id);
	}

	@Override
	public List<Pessoa> buscarTodasPessoas() {
		return entitymanager.createQuery("from Pessoa", Pessoa.class).getResultList();
	}

}
