package com.sptech.school.sptech.school;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("jogos")
public class JogoController {
    List<Jogo> biblioteca = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Jogo>> listar() {
        return !biblioteca.isEmpty() ?
                ResponseEntity.status(200).body(biblioteca) : ResponseEntity.status(204).build();
    }

    @GetMapping("/{indice}")
    public Jogo buscarPorIndice(@PathVariable int indice) {
        return indice < biblioteca.size() ? biblioteca.get(indice) : null;
    }

    @PostMapping
    public Jogo cadastrar(@RequestBody Jogo novoJogo) {
        biblioteca.add(novoJogo);
        return novoJogo;
    }

    @DeleteMapping("/{indice}")
    public ResponseEntity<Void> deletar(@PathVariable int indice) {
        if (indice >= 0 && indice < biblioteca.size()) {
            biblioteca.remove(indice);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }

    @PutMapping("/{indice}")
    public ResponseEntity<Jogo> atualizar(@RequestBody Jogo novoJogo, @PathVariable int indice) {
        if (indice >= biblioteca.size())
            return ResponseEntity.status(404).build();

        biblioteca.set(indice, novoJogo);
        return ResponseEntity.status(200).body(novoJogo);
    }


}
