package exercicios02;

import java.util.Scanner;

public class Multiplos {
	public static void main(String[] args) {
        Scanner numeroInfo = new Scanner(System.in); // começa o scanner
        
        try{
            System.out.println("Digite o 1º número: ");
            float primeiroNumero = numeroInfo.nextFloat(); // recebe o primeiro número
            System.out.println("Digite o 2º número: ");
            float segundoNumero = numeroInfo.nextFloat();// recebe o segundo número

            if (primeiroNumero < segundoNumero){//verificando se o primeiro número é maior que o segundo
                int temp = (int) primeiroNumero;//armazenando o valor do primeiro número em uma variável temporária
                primeiroNumero = segundoNumero;//atribuindo o valor do segundo número ao primeiro
                segundoNumero = temp;//atribuindo o valor da variável temporária ao segundo número
                
            }

            boolean multiples = (primeiroNumero % segundoNumero == 0 ); // verifica se o resto da divsão é zero se for, recebe true

            if (multiples == true){//verifica se são multiplos
                System.out.println("Os números são múltiplos.");
            }
            else{
                System.out.println("Os números não são múltiplos");
            }
        }
        finally{
        	numeroInfo.close();
        }
    }
}
