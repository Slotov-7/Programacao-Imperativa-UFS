package exercicios01;

import java.util.Scanner;

public class AreaDoTriangulo {
	
	public static double calcularAreaTriangulo(double base, double altura) { // função que calcula a área do triangulo
		if (base <= 0 || altura <= 0) {
			System.out.println("Base e alutura deve ser valores positivos");
			return 0.0;
		}
		else {
			return (base * altura)/2;
		}
	}
	
	public static void main(String[] args) { // recebe as informações sobre os triangulos
		Scanner medidasTriangulo = new Scanner(System.in);
		try {
			System.out.println("Digite a base do triângulo em centímetros: ");
			double base = medidasTriangulo.nextDouble();
			System.out.println("Digite a altura do triângulo em centímetros: ");
			double altura = medidasTriangulo.nextDouble();
			double area = calcularAreaTriangulo(base, altura);//chama a função pra calcular a area do triangulo
			System.out.printf("A área do triângulo é %.2f cm²", area);	
		} 
		finally {
			medidasTriangulo.close();
		}
		
	}
}
