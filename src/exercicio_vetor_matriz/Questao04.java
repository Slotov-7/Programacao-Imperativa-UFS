package exercicio_vetor_matriz;

/*Escreva um que leia um vetor G de 20 elementos caractere que representa o gabarito
de uma prova. A seguir, para cada um dos 50 alunos da turma, leia o vetor de respostas
(R) do aluno e conte o número de acertos. Mostre o no de acertos do aluno e uma
mensagem APROVADO, se a nota for maior ou igual a 6; e mostre uma mensagem
de REPROVADO, caso contrário.*/

import java.util.Arrays;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        char[] vetorGab = new char[20];// vetor de 20 posições
        char[] vetorRespost = new char[20];// vetor de 20 posições
        int qtdAcertos = 0;// variável para contar a quantidade de acertos
        double nota = 0;// variável para armazenar a nota do aluno

        Scanner sr = new Scanner(System.in);// instanciando o objeto Scanner
        System.out.println("Digite o gabarito:");// mensagem para o usuário
        for (int i = 0; i < vetorRespost.length; i++) {// laço de repetição para preencher o vetor do gabarito
            vetorGab[i] = sr.next().charAt(0);// preenchendo o vetor
        }

        for (int aluno = 1; aluno <= 50; aluno++) {// laço de repetição para os 50 alunos
            System.out.printf("Digite as respostas do %dº aluno: ", aluno);// mensagem para o usuário
            for (int i = 0; i < vetorRespost.length; i++) {// laço de repetição para preencher o vetor com as respostas do aluno
                vetorRespost[i] = sr.next().charAt(0);// preenchendo o vetor
                if (vetorGab[i] == vetorRespost[i]) {// condição para verificar se a resposta do aluno é igual ao gabarito
                    qtdAcertos = qtdAcertos + 1;// incrementando a variável de acertos
                }
            }
            nota = qtdAcertos / 2f;// calculando a nota do aluno
            if(nota >= 6){// condição para verificar se o aluno foi aprovado ou reprovado
                System.out.println("O estudante foi APROVADO com nota " + nota);// mensagem para o usuário
            }else{
                System.out.println("O estudante foi REPROVADO com nota " + nota);// mensagem para o usuário
            }
            System.out.println("O Gabarito é: " + Arrays.toString(vetorGab));// mensagem para o usuário
            System.out.println("O Gabarito do aluno : " + Arrays.toString(vetorRespost));// mensagem para o usuário
        }
    }
}
