package aula05exercicios;

import java.util.Scanner;

public class Inss {
	public static void main(String[] args) {
        Scanner inssDate = new Scanner(System.in);
        
        try{
            System.out.print("Digite o valor do salário: ");
            float salario = inssDate.nextFloat();//recebe o salário

            if (salario <= 1100){//verifica o salário e mostra a mensagem correspondente
                float disconto =(salario * 0.075f);//calcula o desconto
                float novoSalario = (float) salario - disconto;//calcula o novo salário
                System.out.printf("Seu salário com o desconto do INSS ficou em : %.2f R$ e o valor descontado foi de %.2f R$", novoSalario, disconto);//mostra o novo salário e o desconto
            }
            else if (salario >= 1100.01 && salario <= 2203.48){
                float disconto =(salario * 0.09f);
                float novoSalario = (float) salario - disconto;
                System.out.printf("Seu salário com o desconto do INSS ficou em : %.2f R$ e o valor descontado foi de %.2f R$", novoSalario, disconto);
            }
            else if (salario >= 2203.49 && salario <=3305.22){
                float disconto = (salario * 0.12f);
                float novoSalario = (float) salario - disconto;
                System.out.printf("Seu salário com o desconto do INSS ficou em : %.2f R$ e o valor descontado foi de %.2f R$", novoSalario, disconto);
            }
            else {
                float disconto = (salario * 0.14f);
                float novoSalario = (float) salario - disconto;
                System.out.printf("Seu salário com o desconto do INSS ficou em : %.2f R$ e o valor descontado foi de %.2f R$", novoSalario, disconto);
            }
        }
        finally{
            inssDate.close();
        }
        
    }
}
