package exercicio_vetor_matriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Escrever um algoritmo que lê um vetor K(15). Crie, a seguir, um vetor P, que contenha
todos os números primos de K. Escreva o vetor P.*/
public class Questao05 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        int [] vetorPrimo = new int[0];


        Random rom = new Random();

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rom.nextInt(40);
        }

        for (int i = 0; i < vetor.length; i++){
            boolean primo = true;
            for (int j = 2; j < vetor[i]; j++){
                if (vetor[i] % j == 0 && vetor[i] != 0 && vetor[i] != 1) {
                    primo = false;
                    break;
                }
            }
            if(primo){
                vetorPrimo = Arrays.copyOf(vetorPrimo, vetorPrimo.length + 1);
                vetorPrimo[vetorPrimo.length - 1] = vetor[i];
            }
        }
        System.out.println(Arrays.toString(vetor));
        System.out.println(Arrays.toString(vetorPrimo));
    }
}
