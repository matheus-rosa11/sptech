package org.example;

import java.util.List;

public class Services {
    private List services;
    public Services(List services) {
        this.services = services;
    }

    public void mostrarServicos() {
        System.out.println("Serviços:\n\n");

        for (var item:services) {
            System.out.println(item + "\n=============");
        }
    }
}
