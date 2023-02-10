package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomeA = new ArrayList<String>();
        List<Integer> anoA = new ArrayList<Integer>();

        List<Animacao> animacoes = new ArrayList<>();

        Animacao a1 = new Animacao("Procurando Nemo", 2004, 2.30);
        Animacao a2 = new Animacao("Shrek", 2005, 2.10);

        animacoes.add(a1);
        animacoes.add(a2);
        animacoes.add(new Animacao("Pica Pau", 2000, 2.10));

        for (int i = 0; i < animacoes.size(); i++) {
            if (animacoes.get(i).getNome().equalsIgnoreCase("Shrek")) {

            }
        }
    }
}