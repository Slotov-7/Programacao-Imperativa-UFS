package exercicio_vetor_matriz;

import java.util.Arrays;
import java.util.Random;

/*Faça um algoritmo que leia um vetor A[10]. Preencha então um vetor B[10] com o
fatorial de cada valor de “A” respeitando as posições, caso o referido valor for positivo
ou nulo. Substitua no final os valores negativos por 0 (zero). Mostre o vetor B.*/
public class Questao09 {
    public static void main(String[] args) {
        int[] vetorA = new int[]{1, 2, -5, 7, -3, 5, 0, 4, 6, -4};
        int[] vetorB = new int[10];

        Random rom = new Random();

        /*for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = rom.nextInt(10);
        }*/
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorA[i] <= 0) {
                continue;
            } else {
                vetorB[i] = fatorial(vetorA[i]);
            }
        }


        System.out.println(Arrays.toString(vetorA));
        System.out.println(Arrays.toString(vetorB));
    }

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            return (int) fatorial;
        }
    }

}


