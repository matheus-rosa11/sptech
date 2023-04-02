package sptech.school.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private ProdutoRepository produtoRepository;
    List<Produto> produtos = new ArrayList<>();

    @PostMapping
    public ResponseEntity<Produto> criar (@RequestBody Produto produto) {
//        produtos.add(produto);
        Produto produtoBanco = produtoService.save(produto);
        return ResponseEntity.status(201).body(produtoBanco);
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listar() {
        List<Produto> produtos = produtoService.findAll();
        return !produtos.isEmpty() ?
                ResponseEntity.status(200).body(produtos) : ResponseEntity.status(204).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> retornarPorId(@PathVariable Long id) {
        Optional<Produto> produtoOpt = produtoService.findById(id);
        return ResponseEntity.of(produtoOpt);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> alterar(@PathVariable long id, @RequestBody Produto produtoAtualizado) {
        if (produtoService.existsById(id)) {
            produtoAtualizado.setId(id);
            produtoService.save(produtoAtualizado);
            return ResponseEntity.status(200).body(produtoAtualizado);
        }

        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover (@PathVariable long id) {
        if (produtoService.existsById(id)) {
            produtoRepository.deleteById(id);
            return ResponseEntity.status(200).build();
        }

        return ResponseEntity.status(404).build();
    }
}
