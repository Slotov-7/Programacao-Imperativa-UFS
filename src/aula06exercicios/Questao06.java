/*Faça um programa para ler o código, descrição,
estoque mínimo e estoque das mercadorias de um
supermercado, onde o Flag será um código igual a
zero (0). Escreva o código e a descrição das
mercadorias com o estoque abaixo do mínimo.*/
package aula06exercicios;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        int codigoProduto, estoqueMinimo, estoqueAtual;
        String descricaoProduto;
        try(Scanner dadosMercado = new Scanner(System.in)){
              do{
                  System.out.println("Digite código do produto ou digite 0 (ZERO) para emcerrar: ");
                  codigoProduto = dadosMercado.nextInt();

                  if(codigoProduto == 0){
                      break;
                  }

                  System.out.println("Digite a descrição do produto: ");
                  descricaoProduto = dadosMercado.next();

                  System.out.println("Digite o estoque atual do produto: ");
                  estoqueAtual = dadosMercado.nextInt();

                  System.out.println("Digite o estoque mínimo do produto: ");
                  estoqueMinimo = dadosMercado.nextInt();

                  if(estoqueAtual < estoqueMinimo){
                      System.out.println("O produto está com estoque abaixo do mínimo:");
                      System.out.println("Código: " + codigoProduto);
                      System.out.println("Descrição: " + descricaoProduto);
                      System.out.println("Estoque Mínimo: " + estoqueMinimo);
                      System.out.println("Estoque Atual: " + estoqueAtual);
                  } else{
                      System.out.println("O produto está com o estoque acima do minimo");
                      System.out.println("Código: " + codigoProduto);
                      System.out.println("Descrição: " + descricaoProduto);
                      System.out.println("Estoque Mínimo: " + estoqueMinimo);
                      System.out.println("Estoque Atual: " + estoqueAtual);
                  }
              } while (true);
                System.out.println("Encerrado");

                dadosMercado.close();
        }
    }

}
