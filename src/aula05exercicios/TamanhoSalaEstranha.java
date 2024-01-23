package aula05exercicios;

import java.util.Scanner;

public class TamanhoSalaEstranha {
	public static void main(String[] args) {
        Scanner salaInfo = new Scanner(System.in); //criando um scanner para ler os dados da sala

        try{
            System.out.println("Digite o comprimento de X da sala:");
            double x = salaInfo.nextDouble(); //lendo o comprimento de X da sala
            System.out.println("Digite o comprimento de Y da sala:");
            double y = salaInfo.nextDouble(); //lendo o comprimento de Y da sala
            System.out.println("Digite o comprimento de Z da sala:");
            double z = salaInfo.nextDouble(); //lendo o comprimento de Z da sala
            System.out.println("Digite o comprimento de W da sala:");
            double w = salaInfo.nextDouble(); //lendo o comprimento de W da sala
            System.out.println("Digite o comprimento de H da sala:");
            double h = salaInfo.nextDouble(); //lendo o comprimento de H da sala

            //calculando as subareas da sala

            float areaRetangulo = (float) (x * y); //calculando a area do quadrado
            float areaTriangulo = (float) (y * z) / 2; //calculando a area do triangulo
            float areaTrapezio = (float) ((w + x) * h) / 2; //calculando a area do trapezio

            //calculando a area total da sala
            float areaTotal = areaRetangulo + areaTriangulo + areaTrapezio;

            
            System.out.printf("AS subareas da sala são: o triângulo com área %.2f, retangulo com área %.2f e o trapézio com área %.2f %n", areaTriangulo, areaRetangulo, areaTrapezio); //mostra as subareas da sala
            
            System.out.printf("A area total da sala é: %.2f", areaTotal); //mostra a area total da sala

        }finally{
            salaInfo.close(); //fechando o scanner
        }
    }
}
