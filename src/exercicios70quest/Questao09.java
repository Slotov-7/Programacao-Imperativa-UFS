/*Desenvolva um algoritmo que efetue a leitura de três valores para os lados de um
triângulo, considerando lados como: A, B e C. O algoritmo deverá verificar se os
lados fornecidos forma realmente um triângulo (cada lado é menor que a soma dos
outros dois lados). Se for esta condição verdadeira, deverá ser indicado qual tipo de
triângulo foi formado: isósceles (dois lados iguais e um diferente), escaleno (todos os
lados diferentes) ou equilátero (todos os lados são iguais). */

package exercicios70quest;

import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {
        Scanner trianguloInfo = new Scanner(System.in);//começa o scanner

        try{
            System.out.print("Digite o tamanho do 1º lado do triângulo: ");
            float primeiroLado = trianguloInfo.nextFloat(); // recebe o tamanho do primeiro lado do triângulo
            System.out.print("Digite o tamanho do 2º lado do triângulo: ");
            float segundoLado = trianguloInfo.nextFloat();// recebe o tamanho do segundo lado do triângulo
            System.out.print("Digite o tamanho do 3º lado do triângulo: ");
            float terceiroLado = trianguloInfo.nextFloat();// recebe o tamanho do terceiro lado do triângulo

            if (primeiroLado + segundoLado > terceiroLado && primeiroLado + terceiroLado > segundoLado && segundoLado + terceiroLado > primeiroLado){//verifica se pode formar triangulo se formar ele continua com o outro if interno
                System.out.println("Pode formar triângulo.");
                if (primeiroLado != segundoLado && primeiroLado != terceiroLado && segundoLado != terceiroLado){ //verifica se todos os lados são diferentes e retorna ESCALENO
                    System.out.println("O triângulo formado é escaleno.");
                }
                else if (primeiroLado == segundoLado && segundoLado == terceiroLado){ // verificas se todos os lados são iguais e retorna EQUILATERO
                    System.out.println("O triângulo formado é equilátero.");
                }
                else{// quando ele não é nenhuma das opcoes anteriores ele so pode ser isóceles, retorna ISÓCELES
                    System.out.println("O triângulo formado é isóceles.");
                }

            }
            else{
                System.out.println("Não pode formar triângulo.");//retorna que não pode formar triangulo
            }
        }
        finally{
            trianguloInfo.close();
        }


    }
}