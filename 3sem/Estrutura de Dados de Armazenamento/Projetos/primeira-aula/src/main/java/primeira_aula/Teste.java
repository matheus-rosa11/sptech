package primeira_aula;

public class Teste {
    public static void main(String[] args) {
        Engenheiro e = new Engenheiro("1234", "João", 15000.0);

        Vendedor v = new Vendedor("5678", "Mickey", 30000.0, 0.1);

        Horista h = new Horista("3456", "Pateta", 20, 100.0);

        System.out.println(e);
        System.out.println(v);
        System.out.println(h);
    }
}
