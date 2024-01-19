package exercicios02;

import java.util.Scanner;

public class Iguais {
	public static void main(String[] args) {
        Scanner numeroInfo = new Scanner(System.in); //criando um scanner para ler os numeros

        try{
            System.out.println("Digite o primeiro número:");
            int primeiroNumero =  numeroInfo.nextInt(); // Recebe o primeiro número
            System.out.println("Digite o segundo número:");
            int segundoNumero = numeroInfo.nextInt(); // recebe o segundo número

            boolean iguais = (primeiroNumero == segundoNumero); // verificando se são iguais

            System.out.printf("Os numeros são iguais? %b", iguais);

        }finally{
            numeroInfo.close(); //fechando o scanner
        }
    }
}
