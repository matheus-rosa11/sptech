package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        List<Medicamento> medicamentos = new ArrayList<Medicamento>();
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);
        Integer respostaUsuario = 0;

        while (respostaUsuario != 4) {
            criarMenu();
            respostaUsuario = leitor.nextInt();

            if (respostaUsuario == 1) {
                medicamentos = cadastrarMedicamento(medicamentos);
            } else if (respostaUsuario == 2) {
                exibirTodosMedicamentos(medicamentos);
            } else if (respostaUsuario == 3) {
                buscarMedicamentoPorNome(medicamentos);
            }
        }

        encerrarPrograma();
    }

    private static void encerrarPrograma() {
        System.out.println("Obrigado por utilizar!");
        System.out.println("Encerrando o programa...");
    }

    private static void buscarMedicamentoPorNome(List<Medicamento> medicamentos) {
        if (medicamentos.size() > 0) {
            Scanner leitorNL = new Scanner(System.in);
            System.out.print("Insira o medicamento que deseja buscar: ");
            String nomeDesejado = leitorNL.nextLine();

            for (Medicamento medicamento:
                    medicamentos) {

                if (medicamento.getNomeMedicamento().equalsIgnoreCase(nomeDesejado)) {
                    exibirMedicamento(medicamento, medicamentos);
                } else {
                    System.out.println("Medicamento não cadastrado.");
                }
            }
        } else {
            System.out.println("Nenhum medicamento cadastrado.");
        }
    }

    private static void exibirTodosMedicamentos(List<Medicamento> medicamentos) {
        if (medicamentos.size() > 0) {
            System.out.println("Medicamentos em estoque: ");
            for (Medicamento item:medicamentos) {
                exibirMedicamento(item, medicamentos);
            }
        } else {
            System.out.println("Nenhum medicamento cadastrado.");
        }
    }

    private static List<Medicamento> cadastrarMedicamento(List<Medicamento> medicamentos) {
        Scanner leitorCadastro = new Scanner(System.in);
        Scanner leitorStringCadastro = new Scanner(System.in);

        System.out.print("Insira o id do medicamento: ");
        Integer inputId = leitorCadastro.nextInt();

        System.out.print("Insira o nome do medicamento: ");
        String inputNome = leitorStringCadastro.nextLine();

        System.out.print("Quantidade em estoque: ");
        Integer inputQtdEstoque = leitorCadastro.nextInt();

        System.out.print("Valor unitário: ");
        Double inputValor = leitorCadastro.nextDouble();

        Medicamento cadMed = new Medicamento(inputId, inputNome, inputQtdEstoque, inputValor);

        medicamentos.add(cadMed);

        return medicamentos;
    }

    private static void criarMenu() {
        System.out.print(
                "========\n" +
                "MENU\n" +
                "========\n" +
                "1 - Cadastrar medicamento\n" +
                "2 - Exibir medicamentos\n" +
                "3 - Buscar medicamento por nome\n" +
                "4 - Sair\n" +
                "Insira o número correspondente: "
        );
    }

    private static void exibirMedicamento(Medicamento item, List<Medicamento> medicamentos) {
        System.out.println(String.format(
                "=========================\n" +
                "Medicamento %d\n" +
                "=========================\n" +
                item + "\n",
                (medicamentos.indexOf(item) + 1)
        ));
    }
}