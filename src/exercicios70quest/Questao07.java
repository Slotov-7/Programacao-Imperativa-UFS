/* Faça um algoritmo que leia duas notas obtidas por um aluno na disciplina de Cálculo,
o número de aulas ministradas e o número de aulas assistidas por este aluno nesta
disciplina. Calcule e mostre a média final deste aluno e diga se ele foi aprovado ou
reprovado. Considere que para um aluno ser aprovado ele deve obter média final igual
ou maior a 6 e ter no mínimo 75% de frequência. */
package exercicios70quest;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        try{
            System.out.println("Digite a primeira nota desses aluno");
            float primeiraNota = notas.nextFloat();
            System.out.println("Digite a segunda nota desses aluno");
            float segundaNota = notas.nextFloat();

            float media = (primeiraNota + segundaNota) / 2;
        }finally {
            notas.close();
        }
    }
}
