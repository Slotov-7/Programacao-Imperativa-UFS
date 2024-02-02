/*Faça um programa em Java para:
 Ler 2 números inteiros; (0,2)
 Calcular e imprimir corretamente o MDC entre os números lidos. (3,8)*/
package atividadeavaliativa02;

import java.util.Scanner;

public class Questao02 {
    private static int calculadorMDC(int numero1, int numero2) {
        while (numero2 != 0) {
            int resto = numero1 % numero2;
            numero1 = numero2;
            numero2 = resto;
        }
        return numero1;
    }
    public static void main(String[] args) {

        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        int mdc = calculadorMDC(numero1, numero2);

        System.out.printf("O MDC de %d e %d é %d.", numero1, numero2, mdc);
    }


}
