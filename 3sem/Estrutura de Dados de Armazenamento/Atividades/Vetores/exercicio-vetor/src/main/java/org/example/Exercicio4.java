package org.example;

import java.util.Scanner;

public class Exercicio4 {
    private int[] numeros;

    public Exercicio4() {
        numeros = new int[10];
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

        System.out.print("Digite um número qualquer: \n");
        resposta = scanNum.nextInt();

        int ocorridos = 0;
        for (int n : numeros) {
            if (n == resposta)
                ocorridos++;
        }

        if (ocorridos > 0)
            System.out.printf("O número %d ocorreu %d vezes", resposta, ocorridos);
        else
            System.out.printf("O número %d não ocorre nenhuma vez.", resposta);
    }
}
