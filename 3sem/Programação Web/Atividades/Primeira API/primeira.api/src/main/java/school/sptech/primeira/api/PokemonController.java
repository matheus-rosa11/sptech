package school.sptech.primeira.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    //region clica aqui man
        //TESTE
    //endregion
    private List<String> pokemon = new ArrayList<String>();

    @GetMapping
    private String totalPokemon() {
        return "Total de pokemon cadastrados: " + pokemon.size();
    }

    @GetMapping("/cadastrar/{pokemon}")
    public String registrarPokemon(@PathVariable String pokemon) {
        this.pokemon.add(pokemon);
        return "Pokemon cadastrado";
    }

    @GetMapping("/recuperar/{indice}")
    public String recuperarPokemon(@PathVariable int indice) {

        if (indice >= 0 && indice >= pokemon.size())
            return "Pokemon não encontrado";

        return pokemon.get(indice);
    }

    @GetMapping("/excluir/{indice}")
    public String excluirPokemon(@PathVariable int indice) {

        if (indice >= 0 && indice >= pokemon.size())
            return "Pokemon não encontrado";

        pokemon.remove(pokemon.get(indice));
        return "Excluído";
    }

    @GetMapping("/atualizar/{indice}/{novoNome}")
    public String atualizarPokemon(@PathVariable int indice, @PathVariable String novoNome) {

        if (indice >= 0 && indice >= pokemon.size())
            return "Pokemon não encontrado";

        pokemon.set(indice, novoNome);
        return "Pokemon atualizado";
    }

    @RequestMapping(value = "/persistPerson", method = RequestMethod.POST)
    public ResponseEntity<String> persistPerson(@RequestBody String pokemon) {
        this.pokemon.add(pokemon);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
