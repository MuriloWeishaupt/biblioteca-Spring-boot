package com.biblioteca.sistema.sistema_biblioteca.service;

import com.biblioteca.sistema.sistema_biblioteca.model.Editora;
import com.biblioteca.sistema.sistema_biblioteca.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepository;

    public List<Editora> listarTodas() {
        return editoraRepository.findAll();
    }

    public Editora buscarPorId(Long id) {
        return editoraRepository.findById(id).orElseThrow(() -> new RuntimeException("Editora não encontrada"));
    }

    public Editora salvar(Editora editora) {
        return editoraRepository.save(editora);
    }

    public Editora atualizar(Long id, Editora editoraAtualizada) {
        Editora editora = buscarPorId(id);
        editora.setNome(editoraAtualizada.getNome());
        return editoraRepository.save(editora);
    }

    public void deletar(Long id) {
        editoraRepository.deleteById(id);
    }



}
