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
        char[] vetorGab = new char[20];
        char[] vetorRespost = new char[20];
        int qtdAcertos = 0;
        double nota = 0;

        Scanner sr = new Scanner(System.in);
        System.out.println("Digite o gabarito:");
        for (int i = 0; i < vetorRespost.length; i++) {
            vetorGab[i] = sr.next().charAt(0);
        }

        for (int aluno = 1; aluno <= 50; aluno++) {
            System.out.printf("Digite as respostas do %dº aluno: ", aluno);
            for (int i = 0; i < vetorRespost.length; i++) {
                vetorRespost[i] = sr.next().charAt(0);
                if (vetorGab[i] == vetorRespost[i]) {
                    qtdAcertos = qtdAcertos + 1;
                }
            }
            nota = qtdAcertos / 2f;
            if(nota >= 6){
                System.out.println("O estudante foi APROVADO com nota " + nota);
            }else{
                System.out.println("O estudante foi REPROVADO com nota " + nota);
            }
            System.out.println("O Gabarito é: " + Arrays.toString(vetorGab));
            System.out.println("O Gabarito do aluno : " + Arrays.toString(vetorRespost));
        }
    }
}
