package aula05exercicios;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner pessoaInfo = new Scanner(System.in);//Scanner para pegar os dados do usuário
        try{
            System.out.println("Digite seu gênero: (M/F)");
            String genero = pessoaInfo.nextLine();//recebe o gênero
            char caracterGenero = Character.toUpperCase(genero.charAt(0));//transforma a primeira letra em maiúscula e pega o primeiro caractere
            if(caracterGenero != 'M' && caracterGenero != 'F'){//verifica se o gênero digitado é válido
                System.out.println("O gênero digitado não é valido.");
            }
            else{//caso o gênero seja válido
                System.out.print("Digite a sua altura em metros. (EX: 1.75) : ");//recebe a altura
                float altura = pessoaInfo.nextFloat();
                float pesoIdeal;//calcula o peso ideal
//mostra o peso ideal
                if(caracterGenero == 'M'){//verifica se o gênero é masculino
                    pesoIdeal = (float) (72.7 * altura) - 58f;
                }
                else{//caso o gênero seja feminino
                    pesoIdeal = (float) (62.1 * altura) - 44.7f;
                }
                System.out.printf("Seu peso ideal é %.2f", pesoIdeal);//mostra o peso ideal
            }
        }
        finally{
        	pessoaInfo.close();
        }
    }
}
