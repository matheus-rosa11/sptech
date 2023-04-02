package org.carros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] carros = new String[5];
        int[] rendimento = new int[5];
        Scanner scanStr = new Scanner(System.in);
        Scanner scanNum = new Scanner(System.in);

        System.out.println("Insira 5 modelos de carro:\n");

        for (int i = 0; i < carros.length; i++) {
            System.out.print(String.format("%d. ", i + 1));
            carros[i] = scanStr.nextLine();
        }

        System.out.println("Insira o rendimento dos carros respectivos");

        for (int i = 0; i < carros.length; i++) {
            System.out.print(String.format("%d. %s: ", i + 1, carros[i]));
            rendimento[i] = scanNum.nextInt();
        }

        String melhorCarro = carros[0];

        int rend = 0;

        for (int i = 0; i < carros.length; i++) {
            if (rendimento[i] > rend) {
                rend = rendimento[i];
                melhorCarro = carros[i];
            }
        }

        System.out.printf("O melhor carro é o %s, com um rendimento de %dKm/L", melhorCarro, rend);
    }
}