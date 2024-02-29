package exercicio_vetor_matriz;

import java.util.Arrays;
import java.util.Random;

/*Escreva um algoritmo que lê uma matriz M(5,5) e calcula as somas:
a) da linha 4 de M; feito
b) da coluna 2 de M;
c) da diagonal principal;
d) da diagonal secundária;
e) de todos os elementos da matriz M; feito
Escrever essas somas e a matriz.*/
public class Questao10 {
    public static void main(String[] args) {
        int [][] matriz = new int[5][5];// matriz de 5x5
        int somaTotal = 0, somaLinha_4 = 0, somaColuna_2 = 0, somaDiagonalP = 0, somaDiagonalS = 0;// variáveis para armazenar as somas

        Random rom = new Random();// instanciando o objeto Random

        for(int i = 0; i < 5; i++){// preenchendo a matriz
            for(int j = 0; j < 5; j++){
                matriz[i][j] = rom.nextInt(10);
            }
        }
        for(int i = 0; i < matriz.length; i++){//calculando a soma da linha 4 com um laço de repetição for que percorre a linha 4 e soma os elementos
            somaLinha_4 += matriz[3][i];// matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3] + matriz[3][4]
        }
        for(int i = 0; i < matriz.length; i++){//calculando a soma da coluna 2 com um laço de repetição for que percorre a coluna 2 e soma os elementos
            somaColuna_2 += matriz[i][1];// matriz[0][1] + matriz[1][1] + matriz[2][1] + matriz[3][1] + matriz[4][1]
        }
        for(int i = 0; i < matriz.length; i++){//calculando a soma da diagonal principal com um laço de repetição for que percorre a diagonal principal e soma os elementos
            somaDiagonalP += matriz[i][i];// matriz[0][0] + matriz[1][1] + matriz[2][2] + matriz[3][3] + matriz[4][4]
        }
        for (int i = 0; i < matriz.length; i++){//calculando a soma da diagonal secundária com um laço de repetição for que percorre a diagonal secundária e soma os elementos
            somaDiagonalS += matriz[i][matriz.length - 1 - i];// matriz[0][4] + matriz[1][3] + matriz[2][2] + matriz[3][1] + matriz[4][0]
        }

        for (int i = 0; i < 5; i++) {//calculando a soma de todos os elementos da matriz com um laço de repetição for que percorre a matriz e soma os elementos
            for (int j = 0; j < 5; j++) {
                somaTotal += matriz[i][j];
            }
        }

        System.out.println("A matriz é : ");
        for (int i = 0; i < matriz.length; i++) {//mostra a matriz
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
        System.out.println("A soma da linha 4 da matriz é " + somaLinha_4);
        System.out.println("A soma da coluna 2 da matriz é " + somaColuna_2);
        System.out.println("A soma da diagonal principal é " + somaDiagonalP);
        System.out.println("A soma da diagonal secundária é " + somaDiagonalS);
        System.out.println("A soma de todos os elementos da matriz é " + somaTotal);



    }
}
