package sptech.school.introducaojpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;
    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody Produto produto) {
        produtoRepository.save(produto);
        return ResponseEntity.status(201).body(produto);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        List<Produto> ret = produtoRepository.findAll();
        return ret.isEmpty() ?
                ResponseEntity.status(204).build() :
                ResponseEntity.status(200).body(ret);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscaPorId(@PathVariable long id) {
        Optional<Produto> produtoOptional = produtoRepository.findById(id);
        return ResponseEntity.of(produtoOptional);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
            return ResponseEntity.status(200).build();
        }

        return ResponseEntity.status(404).build();
    }
}
