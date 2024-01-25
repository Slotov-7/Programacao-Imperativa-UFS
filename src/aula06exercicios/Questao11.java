/*Faça um programa que leia as notas dos alunos de
5 turmas, sendo que cada turma tem 25 alunos, e
escreva qual a maior nota de cada turma e qual a
média de todas as turmas;*/
package aula06exercicios;
import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaTurma , maiorNota = Double.MIN_VALUE, somaNotas = 0, nota;
        int contador =0;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 25; j++){
                contador++;
                System.out.printf("Turma %d: Qual a nota do aluno %d da turma: " , i, contador);
                nota = input.nextDouble();

                somaNotas += nota;


                if(nota > maiorNota) {
                    maiorNota = nota;
                }
            }
            mediaTurma = somaNotas /5;
            System.out.printf("A media da turma %d é %.2f", i, mediaTurma);
            System.out.printf("A maior nota da turma %d é %.2f ", i, maiorNota);
        }
    }


}


