package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fruta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<String> frutas = new ArrayList<String>();

        frutas.add("banana");
        frutas.add("abacaxi");
        frutas.add("uva");

        System.out.println("Insira uma fruta...");
        String inputFruta = leitor.nextLine();

        for (String fruta:
             frutas) {
            if (frutas.contains(inputFruta)) {
                System.out.println(String.format("A fruta %s existe na lista!", inputFruta));
                break;
            } else {
                System.out.println(String.format("Nao existe a fruta %s na lista", inputFruta));
                break;
            }
        }
    }
}