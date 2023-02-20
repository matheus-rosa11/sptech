package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<IFuncionario> bonificados;

    public ControleBonus() {
        this.bonificados = new ArrayList<>();
    }

    public void adicionarBonificado(IFuncionario funcionario) {
        bonificados.add(funcionario);
    }

    public void exibirBonificados() {
        for (IFuncionario f : bonificados) {
            System.out.printf("Funcionario %d:\n%s\n", bonificados.indexOf(f) + 1, f.toString());
        }
    }

    public double calculaTotalBonus() {
        double total = 0.0;

        for (IFuncionario f : bonificados) {
            total += f.getValorBonus();
        }

        return total;
    }

    @Override
    public String toString() {
        return "ControleBonus{" +
                "bonificados=" + bonificados +
                '}';
    }
}
