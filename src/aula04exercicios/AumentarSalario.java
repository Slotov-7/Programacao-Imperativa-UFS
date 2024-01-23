package aula04exercicios;

import java.util.Scanner;

public class AumentarSalario {
    public static void main(String[] args) {
        Scanner salaryData = new Scanner(System.in);// cria um scanner para receber os dados do usuário
        try{
            System.out.println("Digite o salário atual: ");
            float currentSalary = salaryData.nextFloat();// recebe o salário atual
            System.out.println("Digite o percentual de aumento: ");
            float increasePercentage = (salaryData.nextFloat()/100);  // recebe o percentual de aumento
            float newSalary = currentSalary + (currentSalary * increasePercentage); // calcula o novo salário
            System.out.printf("O salario antigo era: %.2f, com o aumento o novo salário ficou em %.2f\n", currentSalary, newSalary);// mostra o novo salário
        }finally{
            salaryData.close();
        }
    }
}
