package exercicios01;

import java.util.Scanner;

public class CambioRealDollar {
	public static float funcaoCambio(float valorReal, float valorDollar){
		return valorReal / valorDollar;
	}
	
	public static void main(String[] args) {
		Scanner infoCambio = new Scanner(System.in);
		try {
		System.out.println("Digite o valor em reais R$ :");
		float real = infoCambio.nextFloat();
		System.out.println("Digite a cotação do dollar atualmente US$ : ");
		float dollar = infoCambio.nextFloat();
		float valorCambio = funcaoCambio(real, dollar);
		
		System.out.printf("O valor convertido é de %.2f R$ ", valorCambio);
		}finally {
			infoCambio.close();
		}
	}
}
