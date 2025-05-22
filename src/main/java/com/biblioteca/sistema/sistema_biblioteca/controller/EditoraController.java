package com.biblioteca.sistema.sistema_biblioteca.controller;

import com.biblioteca.sistema.sistema_biblioteca.model.Editora;
import com.biblioteca.sistema.sistema_biblioteca.service.EditoraService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoras")
@Tag(name = "Editoras", description = "Endpoints para gerenciamento de editoras na biblioteca")
@CrossOrigin("*")
public class EditoraController {

    @Autowired
    EditoraService editoraService;

    @GetMapping
    @Operation(summary = "Listar todas as Editoras", description = "Retorna uma lista de todas as editoras cadastradas")
    public List<Editora> listar() {
        return editoraService.listarTodas();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Buscar Editoras por ID", description = "Retorna uma editora específica")
    public Editora buscarPorId(@PathVariable Long id) {
        return editoraService.buscarPorId(id);
    }

    @PostMapping
    @Operation(summary = "Cadastrar nova Editora", description = "Adiciona uma nova editora ao sistema")
    public Editora salvar(@RequestBody Editora editora) {
        return editoraService.salvar(editora);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar Editora", description = "Atualiza editora existente")
    public Editora atualizar(@PathVariable Long id, @RequestBody Editora editora) {
        return editoraService.atualizar(id, editora);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Remover Editora", description = "Exclui uma editora do sistema pelo ID")
    public void deletar(@PathVariable Long id) {
        editoraService.deletar(id);
    }
}
