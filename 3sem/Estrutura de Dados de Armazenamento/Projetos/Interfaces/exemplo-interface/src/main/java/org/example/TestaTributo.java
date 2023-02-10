package org.example;

public class TestaTributo {
    public static void main(String[] args) {
        Alimento a = new Alimento(1, "Produto legal", 100.0, 10);

        Perfume p = new Perfume(2, "Produto 2", 120.0, "Amadeirado");

        Servico s = new Servico("Serviço não é produto", 250.0);

        Tributo t = new Tributo();

        t.adicionaTributavel(a);
        t.adicionaTributavel(p);
        t.adicionaTributavel(s);

        System.out.printf("O preço total dos tributos é: %.2f", t.calculaTotalAtributo());
    }
}
