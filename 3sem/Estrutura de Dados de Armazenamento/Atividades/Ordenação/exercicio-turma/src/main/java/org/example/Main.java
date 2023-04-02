package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sInt = new Scanner(System.in);
        String[] turma1 = new String[10];
        String[] turma2 = new String[10];
        int qtdAlunos = 0;
        int qtdAlunos1 = 0;
        int qtdAlunos2 = 0;

        do {
            System.out.print("Entre com o nome de um aluno: ");
            String aluno = s.nextLine();
            System.out.print("O aluno pertence a turma 1 ou turma 2? ");
            int turma = sInt.nextInt();

            while (turma != 1 && turma != 2) {
                System.out.println("Turma inválida. Tente novamente");
                System.out.print("O aluno pertence a turma 1 ou turma 2? ");
                turma = sInt.nextInt();
            }

            switch (turma) {
                case 1:
                    turma1[qtdAlunos1] = aluno;
                    qtdAlunos1++;
                    qtdAlunos++;
                    break;
                case 2:
                    turma2[qtdAlunos2] = aluno;
                    qtdAlunos2++;
                    qtdAlunos++;
                    break;
                default:
                    System.out.println("Não foi possível validar a turma.");
                    break;
            }

        } while (qtdAlunos < 10);

        if (qtdAlunos1 > 0) {
            System.out.println("\nTurma 1: ");
            for (int i = 0; i < qtdAlunos1; i++) {
                if (!turma1[i].isEmpty() || !turma1[i].isBlank())
                    System.out.println(turma1[i] + ";");
            }
        } else {
            System.out.println("Nâo há alunos na sala 1.");
        }

        if (qtdAlunos2 > 0) {
            System.out.println("\nTurma 2: ");
            for (int i = 0; i < qtdAlunos2; i++) {
                if (!turma2[i].isEmpty() || !turma2[i].isBlank())
                    System.out.println(turma2[i] + ";");
            }
        } else {
            System.out.println("Não há alunos na sala 2.");
        }
    }
}