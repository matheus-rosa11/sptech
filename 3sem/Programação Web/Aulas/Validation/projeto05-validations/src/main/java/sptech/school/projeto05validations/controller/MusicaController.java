package sptech.school.projeto05validations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.projeto05validations.domain.Musica;
import sptech.school.projeto05validations.repositories.MusicaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("musicas")
public class MusicaController {
    @Autowired
    private MusicaRepository musicaRepository;

    @GetMapping
    public ResponseEntity<List<Musica>> listar() {
        List<Musica> musicas = musicaRepository.findAll();
        return musicas.isEmpty() ?
                ResponseEntity.status(204).build() :
                ResponseEntity.status(200).body(musicas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Musica> buscarPorId(@PathVariable Integer id) {
        Optional<Musica> optionalMusica = musicaRepository.findById(id);
        return ResponseEntity.of(optionalMusica);
    }

    @PostMapping
    public ResponseEntity<Musica> cadastrar(@RequestBody Musica musica) {
        musicaRepository.save(musica);
        return ResponseEntity.status(201).body(musica);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Musica> atualizar(@PathVariable Integer id, @RequestBody Musica novaMusica) {
        if (musicaRepository.existsById(id)) {
            novaMusica.setId(id);
            musicaRepository.save(novaMusica);
            return ResponseEntity.status(200).body(novaMusica);
        }

        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        if (!musicaRepository.existsById(id))
            return ResponseEntity.status(404).build();

        musicaRepository.deleteById(id);
        return ResponseEntity.status(200).build();
    }
}
