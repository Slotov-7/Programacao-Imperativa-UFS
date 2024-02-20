package exercicio_vetor_matriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Faça um algoritmo que leia um vetor N[20]. A seguir, encontre o menor elemento do
vetor N e a sua posição dentro do vetor, mostrando: “O menor elemento de N é”, M,
“ e sua posição dentro do vetor é:”,P.*/

public class Questao01 {
    public static void main(String[] args) {
        int menor = Integer.MAX_VALUE, posicao = 0;//Integer.MAX_VALUE é o maior valor que um int pode ter
        int[] vetor = new int[20];//cria um vetor de 20 posições

        Random rom = new Random();//cria um objeto Random

        for(int i = 0; i < vetor.length; i++){//preenche o vetor com números aleatórios
            vetor[i] = rom.nextInt(40);//o método nextInt gera números aleatórios de 0 até o número passado como argumento
            if (vetor[i] < menor) {//verifica se o número é menor que o menor número já encontrado
                menor = vetor[i];//se for, o menor número passa a ser o número atual
            }
        }
        for(int i = 0; i < vetor.length; i++){//percorre o vetor para encontrar a posição do menor número
            if(vetor[i] == menor){//verifica se o número atual é igual ao menor número
                posicao = i;//se for, a posição do menor número é a posição atual
            }
        }

        System.out.printf("O menor elemento é %d e sua posição dentro do vetor é: %d %n", menor, posicao + 1);//imprime o menor número e sua posição
        System.out.println(Arrays.toString(vetor));//imprime o vetor


    }
}

