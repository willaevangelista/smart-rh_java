package com.generation.smartrh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.smartrh.model.Colaborador;
import com.generation.smartrh.repository.ColaboradorRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/colaboradores")
@CrossOrigin(origins = "*", allowedHeaders = "*")
		
public class ColaboradorController {
	@Autowired
	private ColaboradorRepository colaboradorRepository;
		
	// Localiza todas os colaboradores
	@GetMapping
	public ResponseEntity<List<Colaborador>> getAll(){
		return ResponseEntity.ok(colaboradorRepository.findAll());
	}
		
	// Localizar colaboradores por Id
	@GetMapping("/{id}")
	public ResponseEntity<Colaborador> getByID(@PathVariable Long id) {
		return colaboradorRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
		
	// Localizar colaboradores por nome
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Colaborador>> getByNome(@PathVariable String nome) {
		return ResponseEntity.ok(colaboradorRepository.
				findAllByNomeContainingIgnoreCase(nome));
			
	}
		
	// Inclusão de colaborador
	@PostMapping
	public ResponseEntity<Colaborador> post(@Valid @RequestBody Colaborador colaborador) {
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(colaboradorRepository.save(colaborador));
		
	}
		
	// Atualização de postagens
	@PutMapping 
	public ResponseEntity<Colaborador> put(@Valid @RequestBody Colaborador colaborador) {
		
		return colaboradorRepository.findById(colaborador.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.OK)
						.body(colaboradorRepository.save(colaborador)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}
		
		
	@ResponseStatus(HttpStatus.NO_CONTENT) 
	@DeleteMapping("/{id}") 
	public void delete(@PathVariable Long id) { 
		Optional<Colaborador> colaborador = colaboradorRepository.findById(id);
		if (colaborador.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		colaboradorRepository.deleteById(id);
	}
	
}


