package aula05exercicios;

import java.util.Scanner;

public class PrecoCarro {
	public static void main(String[] args) {
        Scanner infoCarro = new Scanner(System.in); //iniciando o  Scanner

        try{
            System.out.println("Digite o preço de fábrica do carro : ");
            float precoFabrica = infoCarro.nextFloat(); //lendo o preço de fábrica do carro
            float precoDistribuidor = precoFabrica + (precoFabrica * 0.12f);//calculando o preço do distribuidor
            float precoTaxas = precoDistribuidor + (precoDistribuidor * 0.45f);//calculando o preço final do carro
            System.out.printf("O preço final do carro é : %.2f\n", precoTaxas);//mostrando o preço final do carro
        }
        finally{
            infoCarro.close();
        }
    }
}
