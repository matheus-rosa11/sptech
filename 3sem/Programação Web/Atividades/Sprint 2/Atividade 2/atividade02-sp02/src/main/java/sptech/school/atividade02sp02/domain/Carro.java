package sptech.school.atividade02sp02.domain;

import org.springframework.lang.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Size(min = 2, max = 12)
    private String nome;
    @Size(min = 2, max = 10)
    private String fabricante;
    @PastOrPresent
    @Nullable
    private LocalDate dataFabricacao;
    @Min(1950)
    @Max(2022)
    @NotNull
    private int modelo;
    @DecimalMin("0.2")
    @DecimalMax("7.0")
    private double potencialMotor;
    public Carro() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public double getPotencialMotor() {
        return potencialMotor;
    }

    public void setPotencialMotor(double potencialMotor) {
        this.potencialMotor = potencialMotor;
    }
}
