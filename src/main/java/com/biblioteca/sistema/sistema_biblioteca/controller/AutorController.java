package com.biblioteca.sistema.sistema_biblioteca.controller;


import com.biblioteca.sistema.sistema_biblioteca.model.Autor;
import com.biblioteca.sistema.sistema_biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
@CrossOrigin("*")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public List<Autor> listar() {
        return autorService.listarTodos();
    }

    @GetMapping("/{id}")
    public Autor buscarPorId(@PathVariable Long id) {
        return autorService.buscarPorId(id);
    }

    @PostMapping
    public Autor salvar(@RequestBody Autor autor) {
        return autorService.salvar(autor);
    }

    @PutMapping
    public Autor atualizar(@PathVariable Long id, @RequestBody Autor autor) {
        return autorService.atualizar(id, autor);
    }

    @DeleteMapping
    public void deletar(@PathVariable Long id) {
        autorService.deletar(id);
    }

}
