/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

public class TreinadorPokemon {
    private String nome = "";
    private Integer nivel = 0;

    public String getNome() {
        return nome;
    }
    
    public String setNome(String _nome) {
        return nome = _nome;
    }

    public Integer getNivel() {
        return nivel;
    }
    
    public void treinarPokemon(Pokemon pokemon) {
        pokemon.setForca(pokemon.getForca() *  1.1);
        pokemon.setDoces(pokemon.getDoces() + 10);
        nivel += 2;
    } 
    
    public void evoluirPokemon(Pokemon pokemon, String nomeDaEvolucao) {
        if (pokemon.getDoces() >= 50) {
            String nomeAntigo = pokemon.getNome();
            pokemon.setNome(nomeDaEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            nivel += 10;
            System.out.println(String.format("Pokémon %s evoluiu para %s\n============", nomeAntigo, pokemon.getNome()));
        } else {
            System.out.println("Não é possível realizar a operação!");
        }
    }
    
}
