package aula05exercicios;

import java.util.Scanner;

public class MenorValor {
	public static void main(String[] args) {
        Scanner numeroInfo =  new Scanner(System.in);//iniciando o  Scanner

        try{
            System.out.print("Digite o primeiro número: ");
            float primeiroNumero = numeroInfo.nextFloat();//lendo o primeiro número
            System.out.print("Digite o segundo número: ");
            float segundoNumero = numeroInfo.nextFloat();//lendo o segundo número

            if (primeiroNumero > segundoNumero){//verificando se o primeiro número é maior que o segundo
                int temp = (int) primeiroNumero;//armazenando o valor do primeiro número em uma variável temporária
                primeiroNumero = segundoNumero;//atribuindo o valor do segundo número ao primeiro
                segundoNumero = temp;//atribuindo o valor da variável temporária ao segundo número
                
            }
            System.out.printf("O valor do menor número é %.1f e o maior é %.1f", primeiroNumero, segundoNumero);//mostrando o resultado
        }finally{
            numeroInfo.close();//fechando o Scanner
        }
    }
}
