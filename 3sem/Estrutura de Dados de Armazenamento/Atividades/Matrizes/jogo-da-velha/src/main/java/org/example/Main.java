package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        JogoDaVelha jogo = new JogoDaVelha();

        Scanner scanLinha = new Scanner(System.in);
        Scanner scanColuna = new Scanner(System.in);
        Scanner scanJogada = new Scanner(System.in);

        int countJogada = 1;

        char jogador = ' ';

        do {
            boolean jogadaPar = countJogada % 2 == 0 ? true : false;

            jogador = jogadaPar ? JogoDaVelha.BOLA : JogoDaVelha.XIS;

            jogo.imprimirTabuleiro();

            System.out.printf("É a vez de %c", jogador);

            System.out.println("\nFaça sua jogada!");

            System.out.printf("Linha: ");
            int linha = scanLinha.nextInt();

            System.out.printf("Coluna: ");
            int coluna = scanColuna.nextInt();

            while (!jogo.jogadaValida(linha -1 , coluna -1)) {
                System.out.println("Resposta inválida.");

                System.out.printf("Linha: ");
                linha = scanLinha.nextInt();

                System.out.printf("Coluna: ");
                coluna = scanColuna.nextInt();
            }

            jogo.fazerJogada(linha - 1, coluna - 1, jogador);

            ++countJogada;

        } while (!jogo.jogoTerminou());

        if (jogo.jogoTerminou()) {
            jogo.imprimirTabuleiro();
            System.out.printf("O jogo acabou. O vencedor é %c", jogador);
        }
    }
}