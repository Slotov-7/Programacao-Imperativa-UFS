/*Escrever um algoritmo para ler dois números. Se os números forem iguais imprimir a
mensagem: “Números iguais” e encerrar a execução; caso contrário, imprimir o de
maior valor, acompanhando pela mensagem “é maior número”.*/
package exercicios70quest;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner numeroInfo = new Scanner(System.in);

        try{
            System.out.println("Digite o primeiro número: ");
            int primeiroNum = numeroInfo.nextInt();
            System.out.println("Digite o segundo número: ");
            int segundoNum = numeroInfo.nextInt();

            if (primeiroNum == segundoNum){
                System.out.println("Os números são iguais.");
            }else{
                if(primeiroNum < segundoNum){
                    primeiroNum = segundoNum;
                }
                System.out.printf("O maior valor é %d", primeiroNum);
            }
        }finally {
            numeroInfo.close();
        }
    }
}
