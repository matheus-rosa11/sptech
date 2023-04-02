package org.example;

import java.util.Scanner;

public class Exercicio3 {
    private String[] nomes;

    public Exercicio3() {
        nomes = new String[10];
    }

    public void rodar() {
        Scanner scan = new Scanner(System.in);

        String resposta = "";
        int contador = 0;

        do {
            System.out.printf("Insira o %dº nome no vetor: ", contador + 1);
            resposta = scan.nextLine();
            nomes[contador] = resposta;
            contador++;
        } while (contador < nomes.length);

        System.out.print("Digite qualquer nome: ");
        resposta = scan.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(resposta)) {
                System.out.printf("\nO nome %s foi encontrado no índice %d\n", resposta, i);
                encontrado = true;
            }
        }

        if (!encontrado)
            System.out.println("Nome não encontrado.");
    }

}
