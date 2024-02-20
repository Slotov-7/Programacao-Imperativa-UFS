package exercicio_vetor_matriz;

import java.util.Arrays;
import java.util.Random;


/*Faça um algoritmo que leia um vetor K[30]. Troque a seguir, todos os elementos de
ordem ímpar do vetor com os elementos de ordem par imediatamente posteriores. */
public class Questao02 {
    public static void main(String[] args) {
        int[] vetor = new int[30];//vetor de 30 posições

        Random rom = new Random();//gerador de números aleatórios

        for(int i = 0; i < vetor.length; i++){//laço para preencher o vetor
            vetor[i] = rom.nextInt(50);//preenche o vetor com números aleatórios
        }

        int[] vetorCopia = vetor.clone();//copia o vetor original

        for (int i = 0; i < vetorCopia.length - 1; i++){//laço para percorrer o vetor
            if(i % 2 == 0){//se a posição for par
                int temp = vetorCopia[i];//guarda o valor da posição atual
                vetorCopia[i] = vetorCopia[i + 1];//troca o valor da posição atual com o valor da posição seguinte
                vetorCopia[i + 1] = temp;//troca o valor da posição seguinte com o valor da posição atual
            }
        }
        System.out.println("Vetor original " + Arrays.toString(vetor));//imprime o vetor original
        System.out.println("Vetor modificado " + Arrays.toString(vetorCopia));//imprime o vetor modificado
    }
}
