/*A Secretaria de Meio Ambiente, que controla o índice de poluição, mantém 3 grupos
de indústrias que são altamente poluentes do meio ambiente. O índice de poluição
aceitável varia de 0,05 até 0,29. Se o índice sobe para 0,3 as indústrias do 1o grupo
são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as indústrias
do 1o e 2o grupo são intimadas a suspenderem suas atividades, se o índice atingir 0,5
todos os grupos devem ser notificados a paralisarem suas atividades. Faça um
programa que leia o índice de poluição e escreva quais serão os grupos intimados. */

package exercicios70quest;

import java.util.Scanner;

public class Questao10{
    public static void main(String[] args){
        Scanner indice = new Scanner(System.in);
        try{
            System.out.println("Digete o indice de poluicao: ");
            double indicePoluicao = indice.nextDouble();

            if(indicePoluicao >= 0.05 && indicePoluicao <= 0.29){
                System.out.println("O indice de poluicao esta aceitavel");
            }else if(indicePoluicao >= 0.3 && indicePoluicao <= 0.39){
                System.out.println("As industrias do grupo 1 serao intimadas a suspenderem suas atividades");
            }else if(indicePoluicao >= 0.4 && indicePoluicao <= 0.49){
                System.out.println("As industrias do grupo 1 e 2 serao intimadas a suspenderem suas atividades");
            }else if(indicePoluicao >= 0.5){
                System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades");
            }else{
                System.out.println("Indice de poluicao invalido");
            }

        }finally{
            indice.close();
        }
    }
}