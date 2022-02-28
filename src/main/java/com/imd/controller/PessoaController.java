package com.imd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imd.model.Pessoa;
import com.imd.repository.IPessoa;

@RestController
@RequestMapping(value = "pessoas")
public class PessoaController {

	@Autowired
	private IPessoa pessoaRepository;
	
	@GetMapping
	public List<Pessoa> todasPessoas () {
		return pessoaRepository.buscarTodasPessoas();
	}
	
	
	@GetMapping("/{pessoaid}")
	public Pessoa buscarPessoa (@PathVariable Long pessoaid) {
		return pessoaRepository.buscarPessoa(pessoaid);
	}
	
	@PostMapping
	public void adicionar(@RequestBody Pessoa pessoa) {
		pessoaRepository.addPessoa(pessoa);
	}
	
}
