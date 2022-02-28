package com.imd.repository;

import java.util.List;

import com.imd.model.Pessoa;

public interface IPessoa {
	void addPessoa (Pessoa p);
	Pessoa buscarPessoa (Long id);
	List<Pessoa> buscarTodasPessoas();
}
