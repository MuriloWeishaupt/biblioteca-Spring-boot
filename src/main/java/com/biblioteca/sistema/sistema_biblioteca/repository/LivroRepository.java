package com.biblioteca.sistema.sistema_biblioteca.repository;

import com.biblioteca.sistema.sistema_biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
