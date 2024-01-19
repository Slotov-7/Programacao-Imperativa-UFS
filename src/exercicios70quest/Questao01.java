/*Escrever um algoritmo para ler dois valores numéricos e apresentar a diferença do
maior pelo menor.*/

package exercicios70quest;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner numeroInfo = new Scanner(System.in);

        try{
            System.out.print("Digite o primiero número: ");
            int primeiroNum = numeroInfo.nextInt();
            System.out.print("Digite o segundo número: ");
            int segundoNum = numeroInfo.nextInt();

            if (primeiroNum < segundoNum){
                int temp = primeiroNum;
                primeiroNum = segundoNum;
                segundoNum = temp;
            }

            int diferenca = primeiroNum - segundoNum;

            System.out.printf("A diferença entre %d e %d é de %d", primeiroNum, segundoNum, diferenca);
        }finally {
            numeroInfo.close();
        }
    }
}
