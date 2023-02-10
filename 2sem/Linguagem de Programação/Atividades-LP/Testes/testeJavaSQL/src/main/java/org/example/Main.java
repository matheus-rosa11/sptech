package org.example;

import com.github.britooo.looca.api.core.Looca;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Looca looca = new Looca();
        Services services = new Services(looca.getGrupoDeServicos().getServicos());

        System.out.println(looca.getMemoria());

    }
}