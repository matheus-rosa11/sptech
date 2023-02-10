/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento;

public class TestePokemon {
    public static void main(String[] args) {

        Pokemon treecko = new Pokemon();
        Pokemon froakie = new Pokemon();
        
        treecko.setNome("Treecko");
        treecko.setTipo("Grama");
        treecko.setForca(100.0);
        treecko.setDoces(20);
        
        froakie.setNome("Froakie");
        froakie.setTipo("Água");
        froakie.setForca(50.0);
        froakie.setDoces(10);
        
        TreinadorPokemon treinador = new TreinadorPokemon();
        
        treinador.setNome("MsRosa");

        for (var i = 1; i <= 5; i++) {
            treinador.treinarPokemon(treecko);
        }

        System.out.println(String.format("Nome: %s\nTipo: %s\nForça: %.2f\nDoces: %d\n============",
                treecko.getNome(), treecko.getTipo(), treecko.getForca(), treecko.getDoces()));
        
        treinador.evoluirPokemon(treecko, "Grovyle");

        System.out.println(String.format("Nome: %s - Tipo: %s - Força: %.2f - Doces: %d\n============",
                treecko.getNome(), treecko.getTipo(), treecko.getForca(), treecko.getDoces()));

        for (var i = 1; i <= 2; i++) {
            treinador.treinarPokemon(froakie);
        }
        
        System.out.println(String.format("Nome: %s\nTipo: %s\nForça: %.2f\nDoces: %d",
                froakie.getNome(), froakie.getTipo(), froakie.getForca(), froakie.getDoces()));
        
        treinador.evoluirPokemon(froakie, "Frogadier");
        
        System.out.println(String.format("Treinador: %s - Nível: %d", treinador.getNome(), treinador.getNivel()));        
    }

}
