package com.br.relacionamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.relacionamento.models.Login;
import com.br.relacionamento.models.Usuario;
import com.br.relacionamento.repositories.LoginRepository;
import com.br.relacionamento.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private LoginRepository loginRepository;
	
	public void cadrastoUsuario(Usuario cadrasto) {
		login.setUsuario(cadrasto);
		loginRepository.save(cadrasto);
	}

	public Iterable<Usuario> pegarTodosUsuarios() {
		return usuarioRepository.findAll();
	}

}
