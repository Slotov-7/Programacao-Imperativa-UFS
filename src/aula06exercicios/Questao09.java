/*A prefeitura de uma cidade fez uma pesquisa entre
seus habitantes, coletando dados sobre o salário e
número de filhos. A prefeitura deseja saber:
*a) média do salário da população;
*b) média do número de filhos;
*c) maior salário;
d) percentual de pessoas com salário até
R$1000,00.
O final da leitura de dados se dará com a entrada de
um salário negativo.*/
package aula06exercicios;

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        double salario, totalSalario = 0, mediaSalario = 0, mediaFilhos = 0, maiorSalario = Double.MIN_VALUE, percentMenMil = 0;
        int qtdFilhos, totalFilhos = 0, contadorHabitante = 1, contadorSalMenMil = 0;
        try(Scanner dadosHabitantes = new Scanner(System.in)){
            while(true){
                System.out.printf("Digite o salário do habitante %d ou digite um valor negativo para encerrar: ", contadorHabitante);
                salario = dadosHabitantes.nextDouble();
                if(salario < 0){
                    break;
                }
                System.out.printf("Digite a quantidade de filhos do habitante %d: ", contadorHabitante);
                qtdFilhos = dadosHabitantes.nextInt();

                if(salario > maiorSalario){
                    maiorSalario = salario;
                }
                if(salario < 1000.00){
                    contadorSalMenMil++;
                }
                percentMenMil = (double) contadorSalMenMil / contadorHabitante * 100;
                totalFilhos = totalFilhos + qtdFilhos;
                mediaFilhos = (double) totalFilhos / contadorHabitante;
                totalSalario = totalSalario + salario;
                mediaSalario = totalSalario / contadorHabitante;
                contadorHabitante++;
                
            }
            System.out.printf("A média do salário da população é: %.2f %n", mediaSalario);
            System.out.printf("A média de filhos da população é: %.0f %n", mediaFilhos);
            System.out.printf("O maior sálario digitado foi: %.2f %n", maiorSalario );
            System.out.println("O percentual da população que recebem um salário menor que 1000 R$ é: " + percentMenMil + "%");

            
        }
    }
}
