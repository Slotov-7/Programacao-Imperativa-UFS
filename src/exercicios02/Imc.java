package exercicios02;

import java.util.Scanner;

public class Imc {
	public static void main(String[] args) {
        Scanner imcInfo = new Scanner(System.in);//Scanner para pegar os dados do usuário
        try{
            System.out.print("Digite a sua altura em metros: ");//recebe a altura
            float altura = imcInfo.nextFloat();//recebe a altura
            System.out.print("Digite seu peso em KG: ");
            float peso = imcInfo.nextFloat();//recebe o peso

            float imc = peso/(altura * altura);//calcula o IMC

            if (imc <= 18.5){//verifica o IMC e mostra a mensagem correspondente
                System.out.printf("Seu IMC foi de %.2f e você está abaixo do peso.",imc);
            }
            else if (imc >= 18.6 && imc <= 24.9){
                System.out.printf("Seu IMC foi de %.2f e você está no peso ideal.",imc);
            }
            else if (imc >= 25 && imc <= 29.9){
                System.out.printf("Seu IMC foi de %.2f e você está acima do peso.",imc);
            }
            else if (imc >=30 && imc <= 34.9){
                System.out.printf("Seu IMC foi de %.2f e você está com obesidade grau 1.",imc);
            }
            else if (imc >= 35 && imc <= 39.9){
                System.out.printf("Seu IMC foi de %.2f e você está com obesidade grau 2 (severa).",imc);
            }
            else{
                System.out.printf("Seu IMC foi de %.2f e você está com obesidade grau 3 (mórbida).",imc);
            }

        }
        finally{
        	imcInfo.close();
        }
    }
}
