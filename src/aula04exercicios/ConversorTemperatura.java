package aula04exercicios;

import java.util.Scanner;

public class ConversorTemperatura {
	public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);// cria um scanner para receber os dados do usuário
        try{
            System.out.println("Digite a temperatura em graus Celsius:");
            float grausCelsius = temperatura.nextFloat(); // recebe a temperatura em graus Celsius
            double grausFahrenheit = (grausCelsius * 9/5) + 32;// calcula a temperatura em graus Fahrenheit
            float grausKelvin = grausCelsius + 273.15f; // calcula a temperatura em graus Kelvin
            System.out.printf("A temperatura em Fahrenheit é: %.2f \n", grausFahrenheit);//mpstra a temperatura em graus Fahrenheit
            System.out.printf("A temperatura em Kelvin é: %.2f \n", grausKelvin);// mostra a temperatura em Kelvin
        } finally{
        	temperatura.close();
        }
    }
}


