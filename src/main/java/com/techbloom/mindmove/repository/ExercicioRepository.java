package com.techbloom.mindmove.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techbloom.mindmove.model.Exercicio;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {
    
	List<Exercicio> findAllByNomeContainingIgnoreCase(String nome);
}
