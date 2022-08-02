
package com.ejemplo.SpringBoot.repository;

import com.ejemplo.SpringBoot.model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    Optional<Persona> findByEmailAndContrasena(@Param("email") String email, @Param("contrasena") String contrasena);
}