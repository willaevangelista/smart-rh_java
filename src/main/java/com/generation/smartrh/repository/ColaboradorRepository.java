package com.generation.smartrh.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.smartrh.model.Colaborador;


public interface ColaboradorRepository extends JpaRepository<Colaborador, Long> {
	
		
		public List<Colaborador> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}



