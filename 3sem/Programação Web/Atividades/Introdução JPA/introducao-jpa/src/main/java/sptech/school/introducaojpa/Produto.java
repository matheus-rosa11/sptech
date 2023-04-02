package sptech.school.introducaojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private double precoUnitario;
    private int quantidadeEstoque;

    public Produto() {
    }

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public Produto(String nome, double precoUnitario, int quantidadeEstoque) {
        this(nome, precoUnitario);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 2)
            this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario >= 0.01)
            this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 1)
            this.quantidadeEstoque = quantidadeEstoque;
    }

    public void adicionarAoEstoque(int quantidade) {
        if (quantidade > 0)
            quantidadeEstoque += quantidade;
    }

    public double getValorEmEstoque() {
        return getPrecoUnitario() * getQuantidadeEstoque();
    }
}
