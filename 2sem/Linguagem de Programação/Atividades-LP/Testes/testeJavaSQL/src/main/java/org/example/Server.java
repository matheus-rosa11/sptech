package org.example;

public class Server {
    private Integer idServidor;
    private Integer fkEmpresa;
    private Double maxUtilizacaoDisco;
    private Double maxUtilizacaoProcessador;
    private Double maxUtilizacaoRam;

    public Integer getIdServidor() {
        return idServidor;
    }

    public Integer getFkEmpresa() {
        return fkEmpresa;
    }

    public Double getMaxUtilizacaoDisco() {
        return maxUtilizacaoDisco;
    }

    public Double getMaxUtilizacaoProcessador() {
        return maxUtilizacaoProcessador;
    }

    public Double getMaxUtilizacaoRam() {
        return maxUtilizacaoRam;
    }
}
