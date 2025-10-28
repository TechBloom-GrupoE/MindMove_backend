package com.techbloom.mindmove.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.techbloom.mindmove.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    // Busca por parte da descrição (ex: "Respiração", "Foco", etc)
    List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
}
