/*Construa um programa que imprima todos os
números ímpares compreendidos entre 81 e 953.(coloquei para o usuario definir o intevalo O
algoritmo também deve mostrar a soma de todos os
valores.*/

package aula06exercicios;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        int numeroInicial, numeroFinal, somaDeTodos = 0, armazenadorNum;
        Scanner numeroIntervalo = new Scanner(System.in);
        System.out.println("Digite o número inicial do intervalo: ");
        numeroInicial = numeroIntervalo.nextInt();
        System.out.println("Digite o número final do intervalo: ");
        numeroFinal = numeroIntervalo.nextInt();
        armazenadorNum = numeroInicial;
        while (armazenadorNum <= numeroFinal){
            if(armazenadorNum % 2 != 0){
                somaDeTodos = somaDeTodos + armazenadorNum;
            }
            armazenadorNum++;
        }
        System.out.printf("A somas de todos os números ímpares do intervalo [%d, %d] é: %d %n ",numeroInicial, numeroFinal, somaDeTodos);
    }
}
