package exercicio_vetor_matriz;

/*Escrever um algoritmo que lê um vetor X(20). Escreva, a seguir, cada um dos valores
distintos que aparecem em X dizendo quantas vezes cada valor aparece em X.*/


import java.util.Arrays;
import java.util.Random;

public class Questao06 {
    public static void main(String[] args) {
        int[] vetor = new int[20];//vetor de 20 posições
        Random rom = new Random();//gerador de números aleatórios

        for (int i = 0; i < 20; i++) {//laço para preencher o vetor
            vetor[i] = rom.nextInt(50);//preenche o vetor com números aleatórios
        }
        System.out.println(Arrays.toString(vetor));//imprime o vetor
        System.out.println("Valores distintos e suas ocorrências:");//mostra a quantidade de ocorrências de cada valor
        for (int i = 0; i < vetor.length; i++) {// percorre o vetor para verificar a quantidade de ocorrências de cada valor
            int valorAtual = vetor[i];//pega o valor atual do vetor
            if (valorAtual == Integer.MIN_VALUE) {//verifica se o valor atual é igual a menor valor inteiro
                continue;//se for, pula para a próxima iteração
            }

            int ocorrencias = 1;//inicializa a variável ocorrencias com 1
            for (int j = i + 1; j < vetor.length; j++) {//percorrer o vetor testando a partir da posição i+1 (ou seja a próxima posição do valor do loop anterior) ate o final do vetor
                if (vetor[j] == valorAtual) {//verifica se o valor da posição j é igual ao valor do vetor na posição i
                    ocorrencias++;//aumenta a quantidade de ocorrências do número atual
                    vetor[j] = Integer.MIN_VALUE; //atribui o menor valor inteiro para o vetor na posição j
                }
            }
            System.out.println("Valor: " + valorAtual + ", Ocorrências: " + ocorrencias);//imprime o valor e suas ocorrências
        }

    }
}

