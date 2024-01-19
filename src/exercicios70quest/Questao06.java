/* Elabore um algoritmo que, dada a idade de um nadador, classifique-o em uma das
seguintes categorias:
 Infantil A: 5 a 7 anos;
 Infantil B: 8 a 10 anos;
 Juvenil A: 11 a 13 anos;
 Juvenil B: 14 a 17 anos;
 Sênior: maiores de 18 anos.*/
package exercicios70quest;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner idadeInfo = new Scanner(System.in);

        try {
            System.out.println("Digite a sua idade: ");
            int idade = idadeInfo.nextInt();

            if(idade >= 5 & idade <= 7){
                System.out.println("A sua categoria é: Infantil A");
            } else if (idade >= 8 & idade <= 10){
                System.out.println("A sua categoria é: Infantil B");
            } else if (idade >= 11 & idade <= 13) {
                System.out.println("A sua categoria é: Juvenil A");
            }else if (idade >= 14 & idade <= 17) {
                System.out.println("A sua categoria é: Juvenil B");
            }else{
                System.out.println("A sua categoria é: Sênior");
            }
        }finally {
            idadeInfo.close();
        }
    }
}
