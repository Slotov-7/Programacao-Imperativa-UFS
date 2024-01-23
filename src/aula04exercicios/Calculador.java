package aula04exercicios;

import java.util.Scanner;

public class Calculador {
	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in); // cria um scanner para receber os números
		try{
	        System.out.println("Digite o primeiro número: ");
	        float numeroUm = numeros.nextFloat(); // recebe o primeiro número
	        System.out.println("Digite o segundo número: ");
	        float numeroDois = numeros.nextFloat(); // recebe o segundo número
	
	        float soma = numeroUm + numeroDois; // soma os números
	        float subtracao = numeroUm - numeroDois;// subtrai os números
	        float multiplicacao = numeroUm * numeroDois;// multiplica os números
	        float divisao = numeroUm / numeroDois;// divide os números
	        float restoDivisao = numeroUm % numeroDois;// calcula o resto da divisão dos números
	        float media = (numeroUm + numeroDois) / 2;// calcula a média dos números
	
	        System.out.printf("A soma entre %.2f e %.2f é %.2f\n", numeroUm, numeroDois, soma);// mostra a soma dos números
	        System.out.printf("A subtração entre %.2f e %.2f é %.2f\n", numeroUm, numeroDois, subtracao);// mostra a subtração dos números
	        System.out.printf("O produto entre %.2f e %.2f é %.2f\n", numeroUm, numeroDois, multiplicacao);// mostra a multiplicação dos números
	        System.out.printf("A divisão entre %.2f e %.2f é %.2f\n", numeroUm, numeroDois, divisao);// mostra a divisão dos números
	        System.out.printf("O resto da divisão entre %.2f e %.2f é %.2f\n", numeroUm, numeroDois, restoDivisao);// mostra o resto da divisão dos números
	        System.out.printf("A média entre %.2f e %.2f é %.2f\n", numeroUm, numeroDois, media );// mostra a média dos números
	    }finally{
	    	numeros.close();// fecha o scanner
	    }
	}
}
