package com.demo.sptech.school;

public class FilmeMapper {
    public static Filme mapFromDto(FilmeDto filmeDto, Filme filme) {
        filme.setQtdOscar(filmeDto.getQuantidade());
        return filme;
    }
}
