/*Escreva um programa que calcule a média dos
números digitados pelo usuário, se eles forem pares.
Termine a leitura se o usuário digitar zero (0);*/
package aula06exercicios;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        int numero, contadorPares = 0, totalPar = 0;
        double mediaPares =0;
        try(Scanner numerosUser = new Scanner(System.in)){
            while (true){
                System.out.println("Digite um número inteiro ou 0 (ZERO) para encerrar: ");
                numero = numerosUser.nextInt();
                if (numero == 0){
                    break;
                }
                if (numero % 2 == 0){
                    totalPar = totalPar + numero;
                    contadorPares++;
                }

            }
            mediaPares = (double) totalPar / contadorPares;
            System.out.printf("A média dos valores pares digitados é: %.2f", mediaPares);
        }
    }
}
