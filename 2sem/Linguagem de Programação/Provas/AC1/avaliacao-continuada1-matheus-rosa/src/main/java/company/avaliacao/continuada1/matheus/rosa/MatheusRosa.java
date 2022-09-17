/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package company.avaliacao.continuada1.matheus.rosa;

import java.util.Scanner;

/**
 *
 * @author AlfaUser
 */
public class MatheusRosa {

    public static void main(String[] args) {
        Scanner leitor1 = new Scanner(System.in);
        MatheusRosa classePrincipal = new MatheusRosa();
        Boolean respostaValida = true;
        Double saldo = 0.0;
        
        while (respostaValida) {
            classePrincipal.mostrarMenu();
            Integer respostaUsuario = leitor1.nextInt();
            
            if(respostaUsuario == 0) {
                System.out.println("Ok. Finalizando programa...");
                respostaValida = false;
                break;
            } else if (respostaUsuario == 1) {
                System.out.println("Qual o valor a ser depositado?");
                Double valorADepositar = leitor1.nextDouble();
                
                if (valorADepositar <= 0) {
                    System.out.println("Alerta! O valor deve ser maior que 0. Valor inválido.");
                } else {
                    saldo += valorADepositar;
                    System.out.println(String.format("Depósito realizado.\nSaldo atual: R$%.2f", saldo));
                }
            } else if (respostaUsuario == 2) {
                System.out.println("Qual o valor a ser retirado?");
                Double valorARetirar = leitor1.nextDouble();
                
                if (saldo > 0) {
                    if (saldo >= valorARetirar){
                        saldo -= valorARetirar;
                        System.out.println(String.format("Saque realizado.\nSaldo atual: R$%.2f", saldo));
                    } else {
                        System.out.println("Saque não realizado.");
                        System.out.println("Saldo menor que valor a retirar.");
                    }
                } else {
                    System.out.println("Saldo indisponível.");
                }
            } else if (respostaUsuario == 3) {
                if (saldo <= 0) {
                    System.out.println("Saldo Zerado. Opção inválida.");
                } else {
                    System.out.println("Será realizada uma simulação considerando uma taxa de juros de 10% ao mês...");
                    classePrincipal.simularInvestimentos(saldo, 12);
                    System.out.println("");
                }
            } else if (respostaUsuario == 4) {
                System.out.println(String.format("Saldo atual: R$%.2f", saldo));
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
        
    public void simularInvestimentos(Double saldo, Integer meses) {
        Double saldoSimulacao = saldo;
        System.out.println(String.format("Saldo atual: %.2f", saldo));
        for (Integer i = 1; i <= meses; i++) {
            saldoSimulacao += saldoSimulacao * 0.1;
            System.out.println(String.format("| Mês %d | Saldo: R$%.2f |", i, saldoSimulacao));
        }
    }
    
    public void mostrarMenu(){
        System.out.println("------------------------");
        System.out.println("SPTech Investimentos");
        System.out.println("------------------------");
        System.out.println("Olá, o que deseja fazer?: ");
        System.out.println(
                "1 - Depositar\n"
                + "2 - Sacar\n"
                + "3 - Simular rendimentos\n"
                + "4 - Consultar saldo\n"
                + "0 - Sair\n");
    }
    
}
