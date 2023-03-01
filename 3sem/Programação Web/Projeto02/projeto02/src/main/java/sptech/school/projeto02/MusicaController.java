package sptech.school.projeto02;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {
    private List<Musica> playlist;
    public MusicaController() {
        this.playlist = new ArrayList<>();
        playlist.add(new Musica("Careless Whisper", "George Michael", 1984));
        playlist.add(new Musica("Me Dê Motivo", "Tim Maia", 1983));
        playlist.add(new Musica("Golden Hour", "JVKE", 2022));
    }

    @GetMapping
    public List<Musica> list() {
        return playlist;
    }

    @GetMapping("/{indice}")
    public Musica recuperar(@PathVariable int indice) {
        return indice >= 0 && indice < playlist.size() ? playlist.get(indice) : null;
    }

    @DeleteMapping("/{indice}")
    public String remover(@PathVariable int indice) {
        if (indice >= 0 && indice < playlist.size()) {
            playlist.remove(indice);
            return "Música removida com sucesso!";
        }

        return "Música não encontrada.";
    }

    @PostMapping
    public Musica criar(@RequestBody Musica musica) {
        playlist.add(musica);
        return musica;
    }

    @PutMapping("/{indice}")
    public String atualizar(@PathVariable int indice, @RequestBody Musica novaMusica) {
        if (indice >= 0 && indice < playlist.size()) {
            playlist.set(indice, novaMusica);
            return "Música atualizada com sucesso!";
        }

        return "Música não encontrada.";
    }

}
