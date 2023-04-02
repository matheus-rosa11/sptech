package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<Bonificavel> bonificados;

    public ControleBonus() {
        this.bonificados = new ArrayList<>();
    }

    public double getTotalBonus() {
        double total = 0.0;

        for (Bonificavel b : bonificados)
            total += b.getValorBonus();

        return total;
    }

    public void adicionarBonificado(Bonificavel bonificavel) {
        bonificados.add(bonificavel);
    }

    @Override
    public String toString() {
        return "ControleBonus{" +
                "bonificados=" + bonificados +
                '}';
    }
}
