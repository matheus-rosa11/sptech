package org.example;

public class MedicoCirurgiao extends Medico {
    private double valorCirurgia;
    private double valorAplicacaoAnestesia;
    private double qtdCirurgia;

    public MedicoCirurgiao(String crm, String nome, double valorCirurgia, double valorAplicacaoAnestesia, double qtdCirurgia) {
        super(crm, nome);
        this.valorCirurgia = valorCirurgia;
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
        this.qtdCirurgia = qtdCirurgia;
    }

    @Override
    public double getValorBonus() {
        return getGanho() * 0.15;
    }

    @Override
    public double getGanho() {
        return getQtdCirurgia() * (getValorCirurgia() + getValorAplicacaoAnestesia());
    }

    public double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

    public double getValorAplicacaoAnestesia() {
        return valorAplicacaoAnestesia;
    }

    public void setValorAplicacaoAnestesia(double valorAplicacaoAnestesia) {
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
    }

    public double getQtdCirurgia() {
        return qtdCirurgia;
    }

    public void setQtdCirurgia(double qtdCirurgia) {
        this.qtdCirurgia = qtdCirurgia;
    }

    @Override
    public String toString() {
        return "MedicoCirurgiao{" +
                "valorCirurgia=" + valorCirurgia +
                ", valorAplicacaoAnestesia=" + valorAplicacaoAnestesia +
                ", qtdCirurgia=" + qtdCirurgia +
                ", valorBonus=" + getValorBonus() +
                "} " + super.toString();
    }
}
