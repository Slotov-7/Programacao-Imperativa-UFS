package exercicios01;

import java.util.Scanner;

public class CalcularMedia { // função pra calcular a média
	
	public static float calcularMedia(float valorUm, float valorDois, float valorTres, float valorQuatro) {
		return (valorUm + valorDois + valorTres + valorQuatro ) / 4;
	}
	
	public static void main(String[] args) { // recebe as informações dos números
		Scanner media = new Scanner(System.in);
		try {
			System.out.println("Digite o 1º valor");
			float valorUm = media.nextFloat();
			System.out.println("Digite o 2º valor");
			float valorDois = media.nextFloat();
			System.out.println("Digite o 3º valor");
			float valorTres = media.nextFloat();
			System.out.println("Digite o 4º valor");
			float valorQuatro = media.nextFloat();
			float valorMedia = calcularMedia(valorUm, valorDois, valorTres, valorQuatro);// chama a função
			
			System.out.printf("O média de todos os números digitatdos é: %.2f", valorMedia);
		}finally {
			media.close();
		}
	}	
	}

