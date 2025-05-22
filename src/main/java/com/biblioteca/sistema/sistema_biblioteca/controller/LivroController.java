package com.biblioteca.sistema.sistema_biblioteca.controller;

import com.biblioteca.sistema.sistema_biblioteca.model.Livro;
import com.biblioteca.sistema.sistema_biblioteca.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

import java.util.List;

@RestController
@RequestMapping("/livros")
@Tag(name = "Livros", description = "Endpoints para gerenciamento de livros na biblioteca")
@CrossOrigin("*")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    @Operation(summary = "Listar todos os livros", description = "Retorna uma lista de todos os livros cadastrados")
    public List<Livro> listar() {
        return livroService.listarTodos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar livro por ID", description = "Retorna os dados de um livro específico")
    public Livro buscarPorId(@PathVariable Long id) {
        return livroService.buscarPorId(id).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    @PostMapping
    @Operation(summary = "Cadastrar novo livro", description = "Adiciona um novo livro ao sistema")
    public Livro cadastrar(@RequestBody Livro livro) {
        return livroService.salvar(livro);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar livro", description = "Atualiza os dados de um livro existente")
    public Livro atualizar(@PathVariable Long id, @RequestBody Livro livro) {
        return livroService.atualizar(id, livro);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remover livro", description = "Exclui um livro do sistema pelo ID")
    public void deletar(@PathVariable Long id) {
         livroService.deletar(id);
    }
}
