package org.example;

public abstract class Medico implements Bonificavel {
    private String crm;
    private String nome;

    public Medico(String crm, String nome) {
        this.crm = crm;
        this.nome = nome;
    }

    @Override
    public double getValorBonus() {
        return 0;
    }

    public abstract double getGanho();

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}

