/*Faça um programa em Java que:
 Leia um valor positivo T que determina a quantidade de termos que serão calculados da
série;
 Leia um valor positivo X;
 Calcule e mostre o valor da série a seguir;
S= -X^2/3! +X^4/2! -X^6/1! + X^8/2! -X^10/3! +X^12/2! ... */
package atividadeavaliativa01;

import java.util.Scanner;

public class Questao03 {
    public  static int fatorial(int valor){
        if(valor == 0){
            return 1;
        }else{
            return fatorial(valor - 1) * valor;
        }
    }

    public static void main(String[] args) {
        int valorT, denominador, sinal, numDenominador =3, sinalsoma = 1;
        double valorX, valorS;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da serie (T): ");
        valorT = scanner.nextInt();
        System.out.print("Digite o valor de X: ");
        valorX = scanner.nextDouble();
        valorS = 0;
        sinal = -1;


        for (int i = 0; i <= valorT * 2; i+=2) {
            denominador = fatorial(numDenominador);
            valorS += sinal * Math.pow(valorX, i) / denominador;
            sinal *= -1;

            if(numDenominador == 1 || numDenominador == 3){
                sinalsoma *= -1;
            }
            numDenominador += sinalsoma;
        }

        System.out.printf("O valor da serie e: %.2f %n", valorS);
    }
}
