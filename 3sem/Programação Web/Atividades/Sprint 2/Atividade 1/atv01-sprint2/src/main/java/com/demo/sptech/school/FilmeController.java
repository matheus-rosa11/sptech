package com.demo.sptech.school;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("filmes")
public class FilmeController {
    private List<Filme> filmes = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Filme>> listarFilmes() {
        return filmes.size() > 0 ?
                ResponseEntity.status(200).body(filmes) : ResponseEntity.status(204).build();
    }

    @GetMapping("/{indice}")
    public ResponseEntity<Filme> buscarPorIndice(@PathVariable int indice) {
        if (indice >= 0 && indice < filmes.size())
            return ResponseEntity.status(200).body(filmes.get(indice));

        return ResponseEntity.status(404).build();
    }

    @PostMapping
    public ResponseEntity<Filme> cadastrarFilme(@RequestBody Filme filme) {
        if (filme.getNome().length() >= 2 && filme.getAnoLancamento() > 1895) {
            filmes.add(filme);
            return ResponseEntity.status(201).body(filme);
        }

        return ResponseEntity.status(400).build();
    }

    @PutMapping("/{indice}")
    public ResponseEntity<Filme> atualizarFilme(@RequestBody Filme novoFilme, @PathVariable int indice) {
        if (indice >= 0 && indice < filmes.size()) {
            filmes.set(indice, novoFilme);
            return ResponseEntity.status(200).body(novoFilme);
        }

        return ResponseEntity.status(404).build();
    }

    @PatchMapping("/{indice}/oscars")
    public ResponseEntity<Filme> atualizarOscarFilme(@PathVariable int indice, @RequestBody FilmeDto filmeDto) {
        if (indice >= 0 && indice < filmes.size()) {
            filmes.set(indice, FilmeMapper.mapFromDto(filmeDto, filmes.get(indice)));
            return ResponseEntity.status(200).body(filmes.get(indice));
        }

        return ResponseEntity.status(404).build();
    }
}
