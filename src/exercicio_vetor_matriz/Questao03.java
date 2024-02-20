package exercicio_vetor_matriz;

import java.util.Arrays;
import java.util.Random;

/*Escreva um algoritmo que leia um vetor de 20 posições e mostre- o. Em seguida,
troque o primeiro elemento com o último, o segundo com o penúltimo, o terceiro com
o antepenúltimo, e assim sucessivamente. Mostre o novo vetor depois da troca.*/
public class Questao03 {
    public static void main(String[] args) {
        int[] vetor = new int[20];//vetor de 20 posições

        Random rom = new Random(); //gerador de números aleatórios

        for(int i = 0; i < vetor.length; i++){//laço para preencher o vetor
            vetor[i] = rom.nextInt(40);//preenche o vetor com números aleatórios
        }

        int[] vetorCopia = vetor.clone();//copia o vetor original para o vetorCopia

        for (int i = 0; i < vetorCopia.length / 2; i++){//laço para inverter o vetor
            int temp = vetorCopia[i];//variável temporária para armazenar o valor do vetorCopia
            vetorCopia[i] = vetorCopia[(vetor.length - 1) - i];//troca o valor do vetorCopia
            vetorCopia[(vetor.length - 1) - i] = temp;//troca o valor do vetorCopia

        }
        System.out.println("Vetor original " + Arrays.toString(vetor));//imprime o vetor original
        System.out.println("Vetor modificado " + Arrays.toString(vetorCopia));//imprime o vetor modificado
    }
}



