package exercicios70quest;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner pessoaInfo = new Scanner(System.in);

        try{
            System.out.println("Digite seu gênero: (M/F)");
            String genero = pessoaInfo.nextLine();
            char caracterGenero = Character.toUpperCase(genero.charAt(0));
            if(caracterGenero != 'M' && caracterGenero != 'F'){
                System.out.println("O gênero digitado não é valido.");
            }
            else{
                System.out.print("Digite a sua altura em metros. (EX: 1.75) : ");
                float altura = pessoaInfo.nextFloat();
                float pesoIdeal;
                if(caracterGenero == 'M'){
                    pesoIdeal = (float) (72.7 * altura) - 58f;
                }
                else{
                    pesoIdeal = (float) (62.1 * altura) - 44.7f;
                }
                System.out.printf("Seu peso ideal é %.2f", pesoIdeal);
            }
        }finally {
            pessoaInfo.close();
        }
    }
}
