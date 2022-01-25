package com.dilermando.myapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilermando.myapi.domain.Usuario;
import com.dilermando.myapi.repositories.UsuarioRepository;
import com.dilermando.myapi.service.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	
	@Autowired
	private UsuarioRepository repository;
	
	
	public Usuario findById(Integer id) {
		
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado id: " + id + ", tipo:" + Usuario.class.getName()));
				
	}


	public List<Usuario> findAll() {
		return repository.findAll();
	}

}
