package exercicio_vetor_matriz;

import java.util.Arrays;
import java.util.Random;


/*Faça um algoritmo que leia um vetor K[30]. Troque a seguir, todos os elementos de
ordem ímpar do vetor com os elementos de ordem par imediatamente posteriores. */
public class Questao02 {
    public static void main(String[] args) {
        int[] vetor = new int[30];

        Random rom = new Random();

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rom.nextInt(50);
        }

        int[] vetorCopia = vetor.clone();

        for (int i = 0; i < vetorCopia.length - 1; i++){
            if(i % 2 == 0){
                int temp = vetorCopia[i];
                vetorCopia[i] = vetorCopia[i + 1];
                vetorCopia[i + 1] = temp;
            }
        }
        System.out.println("Vetor original " + Arrays.toString(vetor));
        System.out.println("Vetor modificado " + Arrays.toString(vetorCopia));
    }
}
