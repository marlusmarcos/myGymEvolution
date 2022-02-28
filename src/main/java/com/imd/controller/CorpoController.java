package com.imd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.imd.model.Corpo;
import com.imd.repository.ICorpo;

@RestController
@RequestMapping(value = "/corpos")
public class CorpoController {
	
	@Autowired
	private ICorpo corpoRepository;

	
	@GetMapping
	public List<Corpo> buscarMedidas () {
		return corpoRepository.buscarTodos();
	}
	
	@GetMapping("/{corpoId}")
	public ResponseEntity<Corpo> buscarUnico (@PathVariable Long corpoId) {
		Corpo corpo =  corpoRepository.buscarCorpo(corpoId);
		if (corpo != null) {
			return ResponseEntity.ok(corpo);
		}
		return ResponseEntity.notFound().build();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Corpo addCorpo(Corpo c) {
		corpoRepository.addCorpo(c);
		return c;
	}
	
}
