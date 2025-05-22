package com.biblioteca.sistema.sistema_biblioteca.controller;


import com.biblioteca.sistema.sistema_biblioteca.model.Autor;
import com.biblioteca.sistema.sistema_biblioteca.service.AutorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
@Tag(name = "Autores", description = "Endpoints para gerenciamento de autores na biblioteca")
@CrossOrigin("*")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    @Operation(summary = "Listar todos os Autores", description = "Retorna uma lista de todos os autores cadastrados")
    public List<Autor> listar() {
        return autorService.listarTodos();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar autor por ID", description = "Retorna os dados de um autor específico")
    public Autor buscarPorId(@PathVariable Long id) {
        return autorService.buscarPorId(id);
    }

    @PostMapping
    @Operation(summary = "Cadastrar novo autor", description = "Adiciona um novo autor ao sistema")
    public Autor salvar(@RequestBody Autor autor) {
        return autorService.salvar(autor);
    }

    @PutMapping
    @Operation(summary = "Atualizar autor", description = "Atualiza os dados de um autor existente")
    public Autor atualizar(@PathVariable Long id, @RequestBody Autor autor) {
        return autorService.atualizar(id, autor);
    }

    @DeleteMapping
    @Operation(summary = "Remover autor", description = "Exclui um autor do sistema pelo ID")
    public void deletar(@PathVariable Long id) {
        autorService.deletar(id);
    }

}
