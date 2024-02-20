package exercicio_vetor_matriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Escrever um algoritmo que lê um vetor K(15). Crie, a seguir, um vetor P, que contenha
todos os números primos de K. Escreva o vetor P.*/
public class Questao05 {
    public static void main(String[] args) {
        int[] vetor = new int[15];//vetor de 15 posições
        int [] vetorPrimo = new int[0];//vetor de 0 posições


        Random rom = new Random();//gerador de números aleatórios

        for(int i = 0; i < vetor.length; i++){//laço para preencher o vetor com números aleatórios
            vetor[i] = rom.nextInt(40);//números aleatórios de 0 a 40
        }

        for (int i = 0; i < vetor.length; i++){//laço para verificar se o número é primo
            boolean primo = true;//variável iniciada como verdadeira para verificar se o número é primo
            for (int j = 2; j < vetor[i]; j++){//laço para verificar se o número é primo
                if (vetor[i] % j == 0 && vetor[i] != 0 && vetor[i] != 1) {//se o número for divisível por outro número que não seja ele mesmo e 1
                    primo = false;//o número não é primo
                    break;//sai do laço
                }
            }
            if(primo){//se o número for primo
                vetorPrimo = Arrays.copyOf(vetorPrimo, vetorPrimo.length + 1);//copia o vetor para um novo vetor com uma posição a mais
                vetorPrimo[vetorPrimo.length - 1] = vetor[i];//adiciona o número primo no final do vetor
            }
        }
        System.out.println(Arrays.toString(vetor));//imprime o vetor original
        System.out.println(Arrays.toString(vetorPrimo));//imprime o vetor com os números primos
    }
}
