package com.biblioteca.sistema.sistema_biblioteca.controller;

import com.biblioteca.sistema.sistema_biblioteca.model.Livro;
import com.biblioteca.sistema.sistema_biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@CrossOrigin("*")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> listar() {
        return livroService.listarTodos();
    }

    @GetMapping("/{id}")
    public Livro buscarPorId(@PathVariable Long id) {
        return livroService.buscarPorId(id).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    @PostMapping
    public Livro cadastrar(@RequestBody Livro livro) {
        return livroService.salvar(livro);
    }

    @PutMapping("/{id}")
    public Livro atualizar(@PathVariable Long id, @RequestBody Livro livro) {
        return livroService.atualizar(id, livro);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
         livroService.deletar(id);
    }
}
