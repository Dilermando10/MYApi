package com.dilermando.myapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dilermando.myapi.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
