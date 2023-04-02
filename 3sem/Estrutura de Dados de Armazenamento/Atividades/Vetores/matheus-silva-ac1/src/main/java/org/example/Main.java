package org.example;

public class Main {
    public static void main(String[] args) {
        ControleBonus cb = new ControleBonus();

        MedicoClinico clinico = new MedicoClinico("123", "Claudio", 100.0, 5);
        MedicoCirurgiao cirurgiao = new MedicoCirurgiao("456", "Joana", 500.0, 70.0, 8);
        Acionista acionista = new Acionista("David", 50, 22.0);

        cb.adicionarBonificado(clinico);
        cb.adicionarBonificado(cirurgiao);
        cb.adicionarBonificado(acionista);

        System.out.printf("Total de bônus: %.2f", cb.getTotalBonus());
    }
}