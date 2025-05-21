package com.biblioteca.sistema.sistema_biblioteca.service;

import com.biblioteca.sistema.sistema_biblioteca.model.Autor;
import com.biblioteca.sistema.sistema_biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> listarTodos() {
        return autorRepository.findAll();
    }

    public Autor buscarPorId(Long id) {
        return autorRepository.findById(id).orElseThrow(() -> new RuntimeException("Autor não encontrado!"));
    }

    public Autor salvar(Autor autor) {
        return autorRepository.save(autor);
    }

    public Autor atualizar(Long id, Autor autorAtualizado) {
        Autor autor = buscarPorId(id);
        autor.setNome(autorAtualizado.getNome());
        return autorRepository.save(autor);
    }

    public void deletar(Long id) {
        autorRepository.deleteById(id);
    }
}
