package com.biblioteca.sistema.sistema_biblioteca.controller;

import com.biblioteca.sistema.sistema_biblioteca.model.Editora;
import com.biblioteca.sistema.sistema_biblioteca.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoras")
@CrossOrigin("*")
public class EditoraController {

    @Autowired
    EditoraService editoraService;

    @GetMapping
    public List<Editora> listar() {
        return editoraService.listarTodas();
    }

    @GetMapping("/{id}")
    public Editora buscarPorId(@PathVariable Long id) {
        return editoraService.buscarPorId(id);
    }

    @PostMapping
    public Editora salvar(@RequestBody Editora editora) {
        return editoraService.salvar(editora);
    }

    @PutMapping("/{id}")
    public Editora atualizar(@PathVariable Long id, @RequestBody Editora editora) {
        return editoraService.atualizar(id, editora);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        editoraService.deletar(id);
    }
}
