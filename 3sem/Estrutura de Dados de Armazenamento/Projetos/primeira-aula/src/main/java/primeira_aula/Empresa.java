package primeira_aula;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<Funcionario>();
    }

    public void adicionarFunc(Funcionario f) {
        funcionarios.add(f);
    }

    public void exibeTodos() {
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    public void exibeTotalSalario() {
        Double total = 0.0;

        for (Funcionario f : funcionarios) {
            total += f.calcSalario();
        }

        System.out.printf("O total dos salários é R$ %.2f", total);
    }

    public void exibieHoristas() {
        System.out.printf("Lista dos horistas: ");

        for (Funcionario f : funcionarios) {
            if (f instanceof Horista) {
                System.out.println(f);
            }
        }
    }
}
