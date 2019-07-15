package com.br.relacionamento.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.relacionamento.models.Login;
import com.br.relacionamento.models.Usuario;
import com.br.relacionamento.repositories.UsuarioRepository;
import com.br.relacionamento.services.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService UsuarioService;

	@GetMapping("/")
	public ModelAndView salvarUsuario() {
		ModelAndView modelAndView = new ModelAndView();
		UsuarioService.cadrastoUsuario(cadrasto);
		return modelAndView;

	}

	@GetMapping("/")
	public ModelAndView exibirUsuarios() {
		ModelAndView modelAndView = new ModelAndView("");
		modelAndView.addObject("usuario", UsuarioService.pegarTodosUsuarios());
		return modelAndView;
	}
	
	@PostMapping("/cadastrar")
	public void cadastrarUsuario(Usuario user, Login login) {
		
	}
}
