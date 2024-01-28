/*Os números perfeitos são aqueles que a soma dos seus divisores é igual a ele mesmo.
Exemplo:
Número Lido: 6
Resultado: 6 = 1 + 2 + 3 (é perfeito)
Número Lido: 28
Resultado: 28= 1 + 2 + 4 + 7 + 14 (é perfeito)
Número Lido: 4
Resultado: 4= 1 + 2 (não é perfeito)
Faça um algoritmo em Java para verificar se determinado número é perfeito. Seu algoritmo deve:
 Ler dois números inteiros;
 Calcular os divisores dos números lidos;
 Imprimir o resultado correto usando a formatação mostrada no exemplo.*/
package atividadeavaliativa01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        int numero;

        try (Scanner numeros = new Scanner(System.in)){
            for(int i = 0; i < 2; i++){
                int somaPerfeito = 0;
                StringBuilder divisor = new StringBuilder();
                System.out.println("Digite um numero: ");
                numero = numeros.nextInt();
                for(int j = 1; j < numero; j++){

                    if (numero % j == 0){
                        somaPerfeito += j;
                        divisor.append(j).append("+");
                    }

                }
                divisor = new StringBuilder(divisor.substring(0, divisor.length() - 1));
                if (somaPerfeito == numero){
                    System.out.println(divisor + "=" + numero);
                    System.out.println("e perfeito");
                }else{
                    System.out.println(divisor + "=" + numero);
                    System.out.println("nao e perfeito");
                }

            }

        }
    }
}