package com.techbloom.mindmove.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techbloom.mindmove.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Optional<Usuario> findByUsuario(String usuario);
	
}
