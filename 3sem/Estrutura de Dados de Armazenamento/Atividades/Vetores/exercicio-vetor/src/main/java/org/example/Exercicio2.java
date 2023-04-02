package org.example;

import java.util.Scanner;

public class Exercicio2 {
    private int[] numeros;

    public Exercicio2() {
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

        double total = 0.0;

        for (int n : numeros)
            total += n;

        double media = total / numeros.length;

        System.out.printf("\nA média dos números no vetor é %.2f\n", media);

        int[] numAcimaMedia = new int[7];

        int indAcimaMedia = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > media) {
                numAcimaMedia[indAcimaMedia] = numeros[i];
                indAcimaMedia++;
            }
        }

        String concatMedia = "";

        for (int i = 0; i < numAcimaMedia.length; i++) {
            if (numAcimaMedia[i] > 0) {
                if (numAcimaMedia[i + 1] == 0)
                    concatMedia += numAcimaMedia[i];
                else {
                    concatMedia += numAcimaMedia[i] + ", ";
                }
            }
        }

        System.out.printf("Números acima da média: %s", concatMedia.trim());
    }
}
