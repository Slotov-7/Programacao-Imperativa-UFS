package exercicio_vetor_matriz;

import java.util.Arrays;
import java.util.Random;

/*Escreva um algoritmo que leia um vetor de 20 posições e mostre- o. Em seguida,
troque o primeiro elemento com o último, o segundo com o penúltimo, o terceiro com
o antepenúltimo, e assim sucessivamente. Mostre o novo vetor depois da troca.*/
public class Questao03 {
    public static void main(String[] args) {
        int[] vetor = new int[20];

        Random rom = new Random();

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rom.nextInt(40);
        }

        int[] vetorCopia = vetor.clone();

        for (int i = 0; i < vetorCopia.length / 2; i++){
            int temp = vetorCopia[i];
            vetorCopia[i] = vetorCopia[(vetor.length - 1) - i];
            vetorCopia[(vetor.length - 1) - i] = temp;

        }
        System.out.println("Vetor original " + Arrays.toString(vetor));
        System.out.println("Vetor modificado " + Arrays.toString(vetorCopia));
    }
}



