/*Fazer um programa gere 50 valores e encontre o
maior e o menor deles, imprimir no final o
resultado.*/

package aula06exercicios;


import java.util.Random;

public class Questao02 {
    public static void main(String[] args) {
        Random aleatoro = new Random();
        int menor = 100, maior = 0;

        int contador = 1;
        int valor = 0;

        while (contador <= 50) {
            valor = (int) aleatoro.nextInt(100);
            if(maior < valor){
                maior = valor;
            }
            if (menor > valor){
                menor = valor;
            }
            contador++;
        }
        System.out.printf("O maior valor sorteado foi %d e o menor foi %d", maior, menor);
    }
}