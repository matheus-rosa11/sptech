package org.example;

public class Main {
    private static final int[] vetor = {32,5,90,54,12,854};
    public static void main(String[] args) {
        System.out.println("=============\nBubble Sort:\n=============");
        bubbleSort(vetor);
        System.out.println("=============\nSelection Sort:\n=============");
        selectionSort(vetor);
        System.out.println("=============\nSelection Sort Otimizado:\n=============");
        selectionSortOtimizado(vetor);
        System.out.println("=============");
    }

    public static void bubbleSort(int[] v) {
        int aux;

        for (int i = 0; i < v.length-1; i++) {
            for (int j = 1; j < v.length-i; j++) {
                if(v[j-1] > v[j]){
                    aux = v[j];
                    v[j] = v[j-1];
                    v[j-1] = aux;
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    public static void selectionSort(int[] v) {
        int aux = 0;

        for (int i = 0; i < v.length; i++){
            for(int j = i +1; j  < v.length; j++){
                if(v[j] < v[i]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    public static void selectionSortOtimizado(int[] v) {
        int aux = 0;

        for (int i = 0; i < v.length; i++) {
            int indMenor = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[indMenor]) {
                    indMenor = j;
                }
            }
            aux = v[i];
            v[i] = v[indMenor];
            v[indMenor] = aux;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}