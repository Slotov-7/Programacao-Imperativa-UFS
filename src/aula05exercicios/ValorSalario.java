package aula05exercicios;

import java.util.Scanner;

public class ValorSalario {
	public static void main(String[] args) {
        Scanner salarioInfo = new Scanner(System.in); // cria um scanner para os dodos a serem inseridos

        try{
            System.out.println("Digite o nome do funcionário: ");
            String nome = salarioInfo.nextLine(); // recebe o nome do funcionário

            System.out.println("Digite o salário do funcionário: ");
            float salario = salarioInfo.nextFloat(); // recebe o salário do funcionário

            System.out.println("Quantos carros o funcionário vendeu: ");
            int carrosVendidos = salarioInfo.nextInt(); // recebe a quantidade de carros vendidos pelo funcionário

            System.out.println("Digite o valor total das vendas: ");
            float totalVendido = salarioInfo.nextFloat(); // recebe o valor total das vendas
                

            float comissao = (totalVendido * 0.05f) + (carrosVendidos * 50); // calcula a comissão do funcionário

            float novoSalario = salario + comissao; // calcula o novo salário do funcionário

            System.out.printf("O funcionário %s vendeu %d carros e teve um total de vendas de %.2fR$, recebendo uma comissão de %.2fR$, e seu salário final foi de %.2fR$%n", nome, carrosVendidos, totalVendido, comissao, novoSalario); // mostra salário do funcionário com as comissões

        }
        finally{
            salarioInfo.close();
        }
    }
}
