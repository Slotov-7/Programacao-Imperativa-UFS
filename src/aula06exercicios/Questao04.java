/*Escrever um programa que lê 5 valores para A, um de
cada vez, e conta quantos destes valores são negativos, no
final imprimir a quantidade e o menor valor.*/

package aula06exercicios;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
            int contador = 0, valorA, contadorNegativo = 0, menorValor = Integer.MAX_VALUE;

            try(Scanner valoresInfo = new Scanner(System.in)){

            while(contador < 5){
                System.out.println("Digite um valor para A: ");
                valorA = valoresInfo.nextInt();

                if(valorA < 0){
                    contadorNegativo++;
                }
                if(valorA < menorValor){
                    menorValor = valorA;
                }
                contador++;
            }
                System.out.printf("Foram digitados %d valores negativos e o menor valor foi: %d", contadorNegativo, menorValor);

        }
    }
}
