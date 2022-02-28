package com.imd.repository;

import java.util.List;

import com.imd.model.Corpo;

public interface ICorpo {
	
	void addCorpo (Corpo c);
	Corpo buscarCorpo (Long id);
	List<Corpo> buscarTodos ();
	
}
