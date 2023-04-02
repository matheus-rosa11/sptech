package sptech.school.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Optional<Produto> findById(long id) {
        return produtoRepository.findById(id);
    }
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }
    public List<Produto> saveAll(List<Produto> produtos) {
        return produtoRepository.saveAll(produtos);
    }

    public boolean existsById(long id) {
        return produtoRepository.existsById(id);
    }

    public void deleteById(long id) {
        produtoRepository.deleteById(id);
    }
}
