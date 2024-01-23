/*Uma loja oferece para os clientes um determinado
desconto de acordo com o valor da compra efetuada.
O desconto é de 20%, se o valor da compra for maior
ou igual a R$250,00 e de 15%, se for menor. Construa
um programa que, para um grupo de dez clientes,
mostre nome, valor da compra, desconto e valor a
pagar de cada cliente. Determine também o quanto
a loja arrecadou com esses clientes.*/

package aula06exercicios;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        try (Scanner dadosCompra = new Scanner(System.in)) {
            int contador = 1;
            double valorCompra, valorDesconto, valorPagar;
            double totalArrecadado = 0;
            String nomeCliente;
            while (contador <= 10) {
                System.out.print("Digite o nome do cliente: ");
                nomeCliente = dadosCompra.next();

                System.out.printf("Digite o valor da compra do cliente %s: ", nomeCliente);
                valorCompra = dadosCompra.nextDouble();


                if (valorCompra >= 250) {
                    valorDesconto = valorCompra * 0.20;
                } else {
                    valorDesconto = valorCompra * 0.15;
                }

                valorPagar = valorCompra - valorDesconto;
                System.out.printf("O valor da compra do cliente %s é: %.2f %n", nomeCliente, valorCompra);
                System.out.printf("O valor do desconto é: %.2f %n", valorDesconto);
                System.out.printf("O valor a pagar é: %.2f %n", valorPagar);

                totalArrecadado =totalArrecadado + valorPagar;
                System.out.println("O valor total arrecadado foi: " + totalArrecadado);
                contador++;
            }
        }
    }
}
