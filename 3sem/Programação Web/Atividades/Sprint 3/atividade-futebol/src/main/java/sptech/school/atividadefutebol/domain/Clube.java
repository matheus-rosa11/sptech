package sptech.school.atividadefutebol.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Clube {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int qtdTitulos;
    private String localidade;
    private int qtdTorcedores;
    private BigDecimal verba;
    @ManyToOne
    private Campeonato campeonato;

    public Clube() {
    }

    public Clube(String nome, int qtdTitulos, String localidade, int qtdTorcedores, BigDecimal verba) {
        this.nome = nome;
        this.qtdTitulos = qtdTitulos;
        this.localidade = localidade;
        this.qtdTorcedores = qtdTorcedores;
        this.verba = verba;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdTitulos() {
        return qtdTitulos;
    }

    public void setQtdTitulos(int qtdTitulos) {
        this.qtdTitulos = qtdTitulos;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public int getQtdTorcedores() {
        return qtdTorcedores;
    }

    public void setQtdTorcedores(int qtdTorcedores) {
        this.qtdTorcedores = qtdTorcedores;
    }

    public BigDecimal getVerba() {
        return verba;
    }

    public void setVerba(BigDecimal verba) {
        this.verba = verba;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
