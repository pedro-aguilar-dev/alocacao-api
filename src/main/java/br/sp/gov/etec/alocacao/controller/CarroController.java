package br.sp.gov.etec.alocacao.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import 
org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import br.sp.gov.etec.alocacao.model.Carro;
import br.sp.gov.etec.alocacao.repository.CarroRepository;

@RestController
public class CarroController {
	
	@Autowired
	CarroRepository repository;
	
	@GetMapping("lista-carros")
	public List<Carro> listarCarros(){
		return	repository.findAll();
	}
	
	@PostMapping("adicionar-carro")
	public Carro inserirCarro(@RequestBody Carro carro) {
		return repository.save(carro);
	}

       @PutMapping("/atualizar-carro")
	public Carro atuazlizarCarro(@RequestBody Carro carro) {
		return repository.save(carro);
	}
	
	@DeleteMapping("/deletar-carro/{id}")
	public ResponseEntity deletarCarro(@PathVariable long id) {
		repository.deleteById(id);
		return new ResponseEntity<>(HttpStatusCode.valueOf(200));
		
	}
	

	

}
