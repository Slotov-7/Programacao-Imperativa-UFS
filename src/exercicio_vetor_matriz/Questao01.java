package exercicio_vetor_matriz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Faça um algoritmo que leia um vetor N[20]. A seguir, encontre o menor elemento do
vetor N e a sua posição dentro do vetor, mostrando: “O menor elemento de N é”, M,
“ e sua posição dentro do vetor é:”,P.*/

public class Questao01 {
    public static void main(String[] args) {
        int menor = Integer.MAX_VALUE, posicao = 0;
        int[] vetor = new int[20];

        Random rom = new Random();

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = rom.nextInt(40);
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == menor){
                posicao = i;
            }
        }

        System.out.printf("O menor elemento é %d e sua posição dentro do vetor é: %d %n", menor, posicao + 1);
        System.out.println(Arrays.toString(vetor));


    }
}

