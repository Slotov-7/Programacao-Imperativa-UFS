/*Faça um algoritmo que leia um número e mostre uma mensagem indicando se este
número é par ou ímpar e se é positivo ou negativo. */
package exercicios70quest;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner numeroInfo = new Scanner(System.in);

        try{
            System.out.print("Digite o número: ");
            int numero = numeroInfo.nextInt();

            if ( numero % 2 == 0){
                System.out.println("O número digitado é par ");
            }else{
                System.out.println("O número digitado é ímpar");
            }

            if (numero >= 0){
                System.out.println("Esse número é positivo");
            }else{
                System.out.println("O número é negativo");
            }
        }finally {
            numeroInfo.close();
        }
    }
}



