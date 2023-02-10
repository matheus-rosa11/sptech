package com.sptech.atividade.com.testes;

/**
 *
 * @author miniguiti
 */
public class Hospital {
    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeHoraExtra;

    public Hospital(String nome) {
        this.nome = nome;
        this.quantidadeDePagamentos = 0;
        this.quantidadeDeHoraExtra = 0;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }

    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }
    
    public void realizarPagamento(Medico medico, Double valorPago) {
        if (medico.getId() == null) return;
        if (valorPago == null) return;
        if (!medico.getAtivo() || valorPago <= 0) return;
        else {
            medico.setSalario(valorPago);
        }
    }
    
    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra) {
        if (medico.getId() == null) return;
        if (valorPago == null) return;
        if (!medico.getAtivo() || valorPago <= 0 || (horaExtra == null && horaExtra <= 0)) return;
        else {
            medico.setSalario(valorPago);
        }
    }
    
    public void desligarMedico(Medico medico) {
        if (medico == null) return;
        if (!medico.getAtivo()) return;
        else {
            medico.setAtivo(false);
        }
    }
}
