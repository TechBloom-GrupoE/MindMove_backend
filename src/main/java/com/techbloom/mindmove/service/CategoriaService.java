package com.techbloom.mindmove.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.techbloom.mindmove.model.Categoria;
import com.techbloom.mindmove.repository.CategoriaRepository;

import jakarta.validation.Valid;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Listar todas as categorias
    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }

    // Buscar por ID
    public Optional<Categoria> buscarPorId(Long id) {
        return categoriaRepository.findById(id);
    }

    // Buscar por descrição
    public List<Categoria> buscarPorDescricao(String descricao) {
        return categoriaRepository.findAllByDescricaoContainingIgnoreCase(descricao);
    }

    // Criar nova categoria
    public Categoria criar(@Valid Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Atualizar categoria existente
    public Categoria atualizar(@Valid Categoria categoria) {
        if (!categoriaRepository.existsById(categoria.getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada!");
        }
        return categoriaRepository.save(categoria);
    }

    // Deletar categoria por ID
    public void deletar(Long id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);

        if (categoria.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada!");
        }

        categoriaRepository.deleteById(id);
    }
}
