package aula05exercicios;

import java.util.Scanner;

public class PolegadasMililitros {
	public static void main(String[] args) {
        Scanner info = new Scanner(System.in);// cria um scanner para o número

        try{
            System.out.println("Digite o valor em polegadas : ");
            float polegadas = info.nextFloat();// recebe o valor em polegadas
            float mililitros = polegadas * 25.4f; //trasforma o valor em polegadas em milimetros
            System.out.printf("O valor em milimetros é : %.2f ml\n", mililitros);// mostra o valor em milimetros
        }

        finally{
            info.close();
        }
    }
}
