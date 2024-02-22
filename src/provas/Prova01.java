package provas;

import java.util.Locale;
import java.util.Scanner;

public class Prova01 {
    public static void main(String[] args) {
        double valorPao = 0.0, valorBroa = 0.0, valorTotal = 0.0, valorVendido = 0.0,  valorInvestimento = 0.0, porcBroa = 0.0, porcPao = 0.0;
        int qtdPao = 0, qtdBroa = 0, qtdVendas = 0, acumulador = 0;
        char formaPag;
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite a quantidade de vendas: ");
        qtdVendas = dados.nextInt();
        while (true){

            if(acumulador == qtdVendas){
                break;
            }else{
                System.out.println("Digite a quantidade de pães: ");
                qtdPao = dados.nextInt();
                System.out.println("Digite a quantidade de broas: ");
                qtdBroa = dados.nextInt();

                valorPao += qtdPao * 0.25;
                valorBroa += qtdBroa * 3.10;
                valorTotal = valorPao + valorBroa;

                System.out.println("Digite a forma de pagamento: PIX (P) / CARTÃO (C) acreciomo 2.5% / DINHIERO (D)");
                formaPag = dados.next().toUpperCase().charAt(0);


                if(formaPag == 'P' || formaPag == 'D'){
                    System.out.printf("O valor total é: %.2f %n" , valorTotal);
                }else{
                    valorTotal = valorTotal + valorTotal * 0.025f;
                    valorBroa = valorBroa + valorBroa * 0.025f;
                    valorPao = valorPao + valorPao * 0.025f;
                    System.out.printf("O valor total com o acrecimo é: %.2f %n", valorTotal);
                }


                acumulador++;
            }
        }

        valorInvestimento = valorTotal * 0.1f;
        System.out.printf("Recomendamos que invista : %.2f %n", valorInvestimento);

        porcPao = (valorPao/ valorTotal) * 100;
        porcBroa = (valorBroa/ valorTotal) * 100;

        System.out.printf("Os pães representam %.3f porcento das vendas %n" , porcPao);
        System.out.printf("As broas representam %.3f porcento das vendas %n" , porcBroa);

        if(qtdPao < qtdBroa){
            System.out.println("O item mais vendido foi a BROA.");
        } else if (qtdPao == qtdBroa) {
            System.out.println("A quantidade de itens vendidos foi igual");
        }else{
            System.out.println("O item mais vendido foi o PÃO");
        }





    }
}