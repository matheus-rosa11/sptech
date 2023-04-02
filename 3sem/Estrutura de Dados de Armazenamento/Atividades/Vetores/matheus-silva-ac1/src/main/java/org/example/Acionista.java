package org.example;

public class Acionista implements Bonificavel {
    private String nome;
    private int qtdAcoes;
    private double precoAcao;

    public Acionista(String nome, int qtdAcoes, double precoAcao) {
        this.nome = nome;
        this.qtdAcoes = qtdAcoes;
        this.precoAcao = precoAcao;
    }

    @Override
    public double getValorBonus() {
        return (getQtdAcoes() * getPrecoAcao()) * 0.25;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAcoes() {
        return qtdAcoes;
    }

    public void setQtdAcoes(int qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public double getPrecoAcao() {
        return precoAcao;
    }

    public void setPrecoAcao(double precoAcao) {
        this.precoAcao = precoAcao;
    }

    @Override
    public String toString() {
        return "Acionista{" +
                "nome='" + nome + '\'' +
                ", qtdAcoes=" + qtdAcoes +
                ", precoAcao=" + precoAcao +
                ", valorBonus=" + getValorBonus() +
                '}';
    }
}
