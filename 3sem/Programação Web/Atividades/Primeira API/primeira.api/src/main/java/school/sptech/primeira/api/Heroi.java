package school.sptech.primeira.api;

public class Heroi {
    private String nome;
    private int idade;
    private String habilidade;
    private double forca;
    private boolean vivo;

    public Heroi() {

    }

    public Heroi(String nome, int idade, String habilidade, double forca, boolean vivo) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.forca = forca;
        this.vivo = vivo;
    }

    //region Comentários
         /*O RETORNO DO JSON É COM BASE NOS GETTERS (retorna o nome depois do prefixo get)
         Quanto não retorna um atributo, o valor fica por último no json

         CAMPOS VIRTUAIS
             São utilizados quando não há necessidade de gravar algo no banco, por exemplo, um campo de status, ou o de descrição feito abaixo

         Ao invés de criar getSenha, criar retornaSenha para trabalhar com os dados sem mostrar no json*/
    //endregion
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public double getForca() {
        return forca;
    }

    public boolean isVivo() {
        return vivo;
    }

    public String getDescricao() {
        return forca > 500.0 ? "Muito forte" : "Mixuruquinha";
    }
}
