package sptech.school.projeto02;

public class Musica {
    private String nome;
    private String autor;
    private int anoLancamento;

    public Musica() {

    }

    public Musica(String nome, String autor, int anoLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
