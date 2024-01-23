package aula04exercicios;

import java.util.Scanner;

public class MeidaPonderada {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in); // cria um scanner para receber as notas e os pesos
        try{
            System.out.println("Digite a primeira nota: ");
            float primeiraNota = notas.nextFloat();// recebe a primeira nota
            System.out.println("Qual o peso da primeira nota: ");
            float primeiroPeso = notas.nextFloat();// recebe o peso da primeira nota
            System.out.println("Digite a segunda nota: ");
            float sugundaNota = notas.nextFloat();// recebe a segunda nota
            System.out.println("Qual o peso da segunda nota: ");
            float segundoPeso = notas.nextFloat();// recebe o peso da segunda nota
            System.out.println("Digite a terceira nota: ");
            float terceiraNota = notas.nextFloat();// recebe a terceira nota
            System.out.println("Qual o peso da terceira nota: ");
            float terceiroPeso = notas.nextFloat();// recebe o peso da terceira nota
            double media = ((primeiraNota * primeiroPeso) + (sugundaNota * segundoPeso) + (terceiraNota * terceiroPeso)) / (primeiroPeso + segundoPeso + terceiroPeso); // calcula a média ponderada
            System.out.printf("As notas foram essas %.2f , %.2f , %.2f e a média ponderada é: %.2f \n", primeiraNota, sugundaNota, terceiraNota, media); // mostra as notas e a média ponderada
    } finally{
    	notas.close();
    }
    }
}
