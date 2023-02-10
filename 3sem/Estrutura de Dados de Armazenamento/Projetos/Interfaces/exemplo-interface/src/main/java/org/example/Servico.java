package org.example;

public class Servico implements ITributavel {
    private String descricao;
    private Double preco;

    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public Double getValorTributo() {
        return getPreco() * 0.12;
    }

    public Double getPreco() {
        return preco;
    }
}
