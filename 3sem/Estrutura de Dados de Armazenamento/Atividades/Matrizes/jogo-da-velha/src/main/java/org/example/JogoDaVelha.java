package org.example;

import java.util.Scanner;

public class JogoDaVelha {
    // Definindo os valores possíveis para as jogadas
    public static final char VAZIO = ' ';
    public static final char XIS = 'X';
    public static final char BOLA = 'O';

    // Criando a matriz que representa o tabuleiro do jogo
    private char[][] tabuleiro;

    // Construtor da classe, inicializando o tabuleiro com valores vazios
    public JogoDaVelha() {
        tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = VAZIO;
            }
        }
    }

    // Método para imprimir o tabuleiro na tela
    public void imprimirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + tabuleiro[i][j]);
            }
            System.out.println("|");
        }
    }

    // Método para verificar se uma jogada é válida
    public boolean jogadaValida(int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            return false;
        }
        if (tabuleiro[linha][coluna] != VAZIO) {
            return false;
        }
        return true;
    }

    // Método para fazer uma jogada
    public boolean fazerJogada(int linha, int coluna, char jogador) {
        if (jogadaValida(linha, coluna)) {
            tabuleiro[linha][coluna] = jogador;
            return true;
        }
        return false;
    }

    // Método para verificar se o jogo terminou
    public boolean jogoTerminou() {
        // Verificando se alguém ganhou nas linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != VAZIO && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return true;
            }
        }
        // Verificando se alguém ganhou nas colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] != VAZIO && tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[1][j] == tabuleiro[2][j]) {
                return true;
            }
        }
        // Verificando se alguém ganhou na diagonal principal
        if (tabuleiro[0][0] != VAZIO && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return true;
        }
        // Verificando se alguém ganhou na diagonal secundária
        if (tabuleiro[0][2] != VAZIO && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return true;
        }

        return false;
    }
}

