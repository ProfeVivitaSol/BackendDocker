package com.vivitasol.projectbackend.services;
import com.vivitasol.projectbackend.entities.Usuario;
import java.util.Optional;
import java.util.List;

public interface UsuarioServices {

    Optional<Usuario> findByUsername(String username);
    Optional<Usuario> findByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Usuario save(Usuario usuario);        
    List<Usuario> findAll();          
    Optional<Usuario> findById(Long id);  
    void deleteById(Long id); 
}
