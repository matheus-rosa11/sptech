package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inteiros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Integer> numerosInteiros = new ArrayList<>();
        Inteiros classePrincipal = new Inteiros();

        Boolean valido = true;
        Integer inputNumero;

        System.out.println("OBS.: Os numeros digitados serao inseridos em uma lista.\n");
        System.out.println("Quando quiser parar, digite 0 (zero).\n");

        while (valido) {
            System.out.print("Insira um numero inteiro: ");
            inputNumero = leitor.nextInt();

            if (inputNumero == 0) {
                System.out.println("Encerrando programa...");

                classePrincipal.exibirPares(numerosInteiros);
                classePrincipal.exibirImpares(numerosInteiros);
                classePrincipal.exibirSomaNumeros(numerosInteiros);
                classePrincipal.exibirMenorMaiorNum(numerosInteiros);

                valido = false;
                break;
            }

            numerosInteiros.add(inputNumero);

        }

    }

    void exibirPares(List<Integer> numerosInteiros) {
        System.out.print("Exibindo numeros pares: ");

        for (Integer num : numerosInteiros) {
            if (num % 2 == 0) {
                System.out.print(" | " + num);
            }
        }
    }

    void exibirImpares(List<Integer> numerosInteiros) {
        System.out.print("\nExibindo numeros impares: ");

        for (Integer num : numerosInteiros) {
            if (num % 2 != 0) {
                System.out.print(" | " + num);
            }
        }
    }

    void exibirSomaNumeros(List<Integer> numerosInteiros) {

        Integer somaTotal = 0;

        for (Integer num : numerosInteiros) {
            somaTotal += num;
        }

        System.out.println(String.format("\nSoma dos numeros: %d", somaTotal));
    }

    void exibirMenorMaiorNum(List<Integer> numerosInteiros) {
        Integer menor = numerosInteiros.get(0);
        Integer maior = numerosInteiros.get(0);

        for (Integer num : numerosInteiros) {
            if (num < menor) {
                menor = num;
            }

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println(String.format("Menor numero: %d", menor));
        System.out.println(String.format("Maior numero: %d", maior));
    }
}
