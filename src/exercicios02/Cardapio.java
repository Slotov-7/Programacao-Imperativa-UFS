package exercicios02;

import java.util.Scanner;

public class Cardapio {
	public static void main(String[] args) {
        //textinho de boas vindas
        System.out.println("Bem vindo ao moura!");
        System.out.println("Nosso cardápio é :");
        System.out.printf("Hambúrguer - R$ 3,00 %nCheeseburguer - R$ 3,50 %nFritas - R$ 2,50%nRefrigerante - R$ 1,00%nMilkshake - R$ 3,00%n");

        Scanner infoCadapio = new Scanner(System.in);// cria um scanner receber os dados que o usuário vai fornecer

        try{
            System.out.println("Quantos hambúrgueres você deseja ? ");
            float hamburguerQtd = infoCadapio.nextFloat();// recebe a quantidade de hambúrgueres
            float hamburguerPreco = hamburguerQtd * 3f;// calcula o preço dos hambúrgueres

            System.out.println("Quantos cheeseburger você deseja ? ");
            float xBurguerQtd = infoCadapio.nextFloat();// recebe a quantidade de cheeseburguer
            float xBurguerPreco = xBurguerQtd * 3.5f;// calcula o preço dos cheeseburguer

            System.out.println("Quantas batatas fritas você deseja ? ");
            float batataQtd = infoCadapio.nextFloat();// recebe a quantidade de fritas
            float batataPreco = batataQtd * 2.5f;// calcula o preço das fritas

            System.out.println("Quantos refrigerantes você deseja ? ");
            float refriQtd = infoCadapio.nextFloat();// recebe a quantidade de refrigerantes
            float refriPreco = refriQtd * 1f;// calcula o preço dos refrigerantes

            System.out.println("Quantos milkshakes você deseja ? ");    
            float milkShakeQtd = infoCadapio.nextFloat();// recebe a quantidade de milkshakes
            float milkShakePreco = milkShakeQtd * 3f;// calcula o preço dos milkshakes

            float totalPrice = hamburguerPreco + xBurguerPreco + batataPreco + refriPreco + milkShakePreco;// calcula o preço total do pedido

            System.out.printf("O valor total do seu pedido é : %.2f\n", totalPrice);// mostra o preço total do pedido
        }
        finally{
            infoCadapio.close();// fecha o scanner
        }
    }
}
