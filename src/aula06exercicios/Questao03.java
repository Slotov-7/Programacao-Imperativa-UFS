/*Faça um programa que leia uma quantidade não
determinada de números positivos. Calcule a quantidade
de números pares e ímpares, a média de valores pares e a
média geral dos números lidos. O número que encerrará a
leitura será zero;*/
package aula06exercicios;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        int valor = 0, contadorPar = 0, valorPar = 0, contadorImpar = 0, valorImpar =0;
        double mediaPar = 0, mediaGeral =0;
        try (Scanner valoresDados = new Scanner(System.in)) {
            while(true){
                System.out.println("Digite um valor inteiro positivo: ");
                valor = valoresDados.nextInt();
                if (valor >= 0){
                    if(valor % 2 == 0  && valor != 0){
                        valorPar = valorPar + valor;
                        contadorPar++;
                    }
                    if(valor % 2 != 0){
                        valorImpar = valorImpar + valor;
                        contadorImpar++;
                    }
                    if(valor == 0){
                        mediaPar = (double) valorPar / contadorPar;
                        mediaGeral = (double) (valorPar + valorImpar) /(contadorImpar + contadorPar);
                        System.out.printf("A media dos valores pares é : %.2f %n",mediaPar);
                        System.out.printf("A media de todos os valores é: %.2f %n", mediaGeral);
                        break;
                    }
                }
            }
        }
    }

}
