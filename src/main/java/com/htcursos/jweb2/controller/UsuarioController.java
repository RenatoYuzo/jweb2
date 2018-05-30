package com.htcursos.jweb2.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htcursos.jweb2.model.Usuario;
import com.htcursos.jweb2.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@CrossOrigin(origins = "*")
	@GetMapping("/usuarios")
	public List<Usuario> buscarTodos() {
		return usuarioRepository.findAll();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping("/usuarios")
	public String cadastrar(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
		return "Usuario Salvo";
	}
	
	@PutMapping("/usuarios")
	public String alterar(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
		return "Usuario Atualizado";
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void remover(@PathVariable("id") Integer id) {
		usuarioRepository.deleteById(id);
	}

}
