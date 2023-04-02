package sptech.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in);

        int vetor[] = {100, 200, 300, 400, 401};
        int soma = 0;

        System.out.println("Somando... ");
        for (int i = 0; i < vetor.length; i++)
            soma += vetor[i];

        System.out.printf("Soma total: %d\n", soma);

        // Pares
        int qtdPares = 0;

        for (int num : vetor) {
            if (num % 2 == 0) {
                System.out.printf("O número %d é par\n", num);
                qtdPares++;
            }
        }

        System.out.printf("Total de números pares: %d\n", qtdPares);

        // Dias da semana
        String[] diasSemana = {
                "Domingo",
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado"
        };

        System.out.print("Digite um número de 1 a 7: ");
        int respostaDia = scanInt.nextInt();

        while (!(respostaDia >= 1 && respostaDia <= 7)) {
            System.out.println("\nResposta inválida. Tente novamente.");
            System.out.print("Digite um número de 1 a 7: ");
            respostaDia = scanInt.nextInt();
        }

        System.out.printf("O dia correspondente ao dia %d é %s", respostaDia, diasSemana[respostaDia - 1]);

    }
}