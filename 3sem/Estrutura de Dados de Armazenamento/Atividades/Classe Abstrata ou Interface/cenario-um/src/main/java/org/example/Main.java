package org.example;

public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("Robson", 5, 60.0);

        Coordenador c = new Coordenador("Felix", 20, 80.0);

        ControleBonus cb = new ControleBonus();

        cb.adicionarBonificado(p);
        cb.adicionarBonificado(c);

        System.out.printf("Total de bônus recebidos: %.2f\n", cb.calculaTotalBonus());

        cb.exibirBonificados();

    }
}
