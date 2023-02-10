package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tributo {
    List<ITributavel> listaTrib;

    public Tributo() {
        this.listaTrib = new ArrayList<ITributavel>();
    }

    public void adicionaTributavel(ITributavel t) {
        listaTrib.add(t);
    }

    public double calculaTotalAtributo() {
        double total = 0.0;
        for (ITributavel t : listaTrib) {
            total += t.getValorTributo();
        }
        return total;
    }
}
