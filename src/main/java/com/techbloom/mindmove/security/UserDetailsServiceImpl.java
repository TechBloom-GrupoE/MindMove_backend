package com.techbloom.mindmove.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.techbloom.mindmove.model.Usuario;
import com.techbloom.mindmove.repository.UsuarioRepository;

// Regras de negócio e o tratamento de dados
// Validar a existência de um usuário no sistema por meio do banco de dados
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		if (username == null || username.trim().isEmpty()) {
			throw new UsernameNotFoundException("Usuário (e-mail) não pode ser vazio");
		}
		
		Optional<Usuario> usuario = usuarioRepository.findByUsuario(username);

		if (usuario.isPresent()) {
			return new UserDetailsImpl(usuario.get());
		}else {
			throw new UsernameNotFoundException("Usuário não encontrado: " + username);
		}
			
	}
}