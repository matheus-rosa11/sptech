package org.dias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        int[] ano = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Insira uma data, direi a qual dia do ano ela corresponde.");
        System.out.print("(dia/mês): ");

        String data = scanStr.nextLine();

        int dia = Integer.parseInt(data.split("/")[0]);
        int mes = Integer.parseInt(data.split("/")[1]);

        int diaAno = dia;
        int indiceMes = mes - 1;

        for (int i = indiceMes - 1; i >= 0; i--) {
            diaAno += ano[i];
        }

        System.out.printf("Você inseriu o dia de número %d do ano.", diaAno);
    }
}
