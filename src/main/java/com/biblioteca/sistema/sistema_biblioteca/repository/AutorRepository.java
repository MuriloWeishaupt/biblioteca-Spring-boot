package com.biblioteca.sistema.sistema_biblioteca.repository;

import com.biblioteca.sistema.sistema_biblioteca.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
