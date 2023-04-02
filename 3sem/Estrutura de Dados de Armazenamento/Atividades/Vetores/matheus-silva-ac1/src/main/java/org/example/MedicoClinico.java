package org.example;

public class MedicoClinico extends Medico {

    private double valorConsulta;
    private int qtdConsulta;

    public MedicoClinico(String crm, String nome, double valorConsulta, int qtdConsulta) {
        super(crm, nome);
        this.valorConsulta = valorConsulta;
        this.qtdConsulta = qtdConsulta;
    }

    @Override
    public double getValorBonus() {
        return getGanho() * 0.1;
    }

    @Override
    public double getGanho() {
        return getQtdConsulta() * getValorConsulta();
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public int getQtdConsulta() {
        return qtdConsulta;
    }

    public void setQtdConsulta(int qtdConsulta) {
        this.qtdConsulta = qtdConsulta;
    }

    @Override
    public String toString() {
        return "MedicoClinico{" +
                "valorConsulta=" + valorConsulta +
                ", qtdConsulta=" + qtdConsulta +
                ", valorBonus=" + getValorBonus() +
                "} " + super.toString();
    }
}
