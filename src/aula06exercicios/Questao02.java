/*Fazer um programa gere 50 valores e encontre o
maior e o menor deles, imprimir no final o
resultado.*/

package aula06exercicios;


import java.util.Random;

public class Questao02 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int menor = Integer.MAX_VALUE, contador = 1, valor, maior =0;

        while (contador <= 50) {
            valor = aleatorio.nextInt(100);
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