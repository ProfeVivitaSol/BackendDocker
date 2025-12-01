package com.vivitasol.projectbackend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.vivitasol.projectbackend.entities.Usuario;
import java.util.Optional;

public interface UsuarioRepositories extends CrudRepository <Usuario, Long>{

    Optional<Usuario> findByUsername(String username);
    Optional<Usuario> findByEmail(String email);

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

}
