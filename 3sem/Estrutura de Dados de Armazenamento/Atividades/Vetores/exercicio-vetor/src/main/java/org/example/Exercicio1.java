package org.example;

import java.util.Scanner;

public class Exercicio1 {

    private int[] numeros;

    public Exercicio1() {
        numeros = new int[7];
    }

    public void rodar() {

        Scanner scanNum = new Scanner(System.in);

        int resposta = 0;
        int contador = 0;

        do {
            System.out.printf("Insira o %dº número no vetor: ", contador + 1);
            resposta = scanNum.nextInt();
            numeros[contador] = resposta;
            contador++;
        } while (contador < numeros.length);

        for (int i = numeros.length - 1; i >= 0; i--)
            System.out.printf("\n%dº número: %d\n", i + 1, numeros[i]);
    }
}
