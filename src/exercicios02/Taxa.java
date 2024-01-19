package exercicios02;

import java.util.Scanner;

public class Taxa {
    public static void main(String[] args) {

        Scanner taxDate = new Scanner(System.in);//iniciando o Scanner


        try{
        System.out.println("Digite o código do produto: ");//recebe o código do produto
        int codigoProduto = taxDate.nextInt();

        System.out.println("Digite o peso do produto em quilos: ");//recebe o peso do produto
        double pesoProduto = taxDate.nextDouble();

        System.out.println("Digite o código do país de origem: ");//recebe o código do país
        int codigoPais = taxDate.nextInt();

        double gramaPreco = 0;//inicializa o valor do grama
        double taxa = 0;//inicializa o valor do imposto

        switch (codigoProduto) {//verifica o código do produto e atribui o valor do grama
            case 1:
            case 2:
            case 3:
            case 4:
            	gramaPreco = 10;
                break;
            case 5:
            case 6:
            case 7:
            	gramaPreco = 25;
                break;
            case 8:
            case 9:
            case 10:
            	gramaPreco = 35;
                break;
            default:
                System.out.println("Código de produto inválido.");
                return;
        }

        switch (codigoPais) {//verifica o código do país e atribui o valor do imposto
            case 1:
                taxa = 0;
                break;
            case 2:
                taxa = 0.15;
                break;
            case 3:
                taxa = 0.25;
                break;
            default:
                System.out.println("Código de país inválido.");
                return;
        }

        double pesoGramas = pesoProduto * 1000;//converte o peso do produto em gramas
        double totalPrecoProduto = pesoProduto * gramaPreco;//calcula o preço total do produto
        double taxaPreco = totalPrecoProduto * taxa;//calcula o valor do imposto
        double totalPreco = totalPrecoProduto + taxaPreco;//calcula o valor total

        System.out.println("O peso do produto convertido em gramas é: " + pesoGramas);
        System.out.println("O preço total do produto comprado é: " + totalPrecoProduto);
        System.out.println("O valor do imposto é: " + taxaPreco);
        System.out.println("O valor total é: " + totalPreco);
        }
        finally{
        taxDate.close();
        }
    }
}
