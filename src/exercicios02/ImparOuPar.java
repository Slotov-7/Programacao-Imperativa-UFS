package exercicios02;

import java.util.Scanner;

public class ImparOuPar {
	public static void main(String[] args) {
        Scanner numeroInfo = new Scanner(System.in); // começando o scanner
        try{
            System.out.print("Digite o número para verificar se é par ou ímpar: ");
            int numero = numeroInfo.nextInt(); // recebe o número

            int resultado = numero % 2; // pegando o resto da divisão 

            if (resultado != 0){ // verificando se o resto da divisão é diferente de zero (0) 
                System.out.println("O número é impar");
            }
            else{
                System.out.println("O número é par");
            }

        }finally{
            numeroInfo.close();
        }
    }
}

