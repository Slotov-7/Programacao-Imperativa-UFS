/*Uma empresa realizou uma pesquisa com os seus fornecedores, na qual foram coletados os seguintes
dados referentes aos produtos fornecidos: Código, Valor e Percentual de aumento. Caso o produto não
tenha sofrido alteração de preço, o percentual de aumento será igual a 0.
Faça um programa em Java que determine e escreva:
• O novo valor de cada um dos produtos com 2 casas decimais.
• A quantidade de produtos mais caros que R$ 100,00 (após aumento) e que tiveram aumento
superior a 5%.
• A média do valor dos produtos que não sofreram aumento com 2 casas decimais.
• A média do valor dos produtos que sofreram aumento com 2 casas decimais.
• Os valores do produto mais barato e do mais caro (após aumento) com 2 casas decimais.
Obs.: O programa solicita novos dados até que o Código digitado seja zero.*/
package atividadeavaliativa01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        int codigo, contadorSAumento = 0, contadorCAumento = 0, contadorMcem = 0, contadoAumen5 = 0, contadorGeral = 0;
        double valor, percenAumento, valorAumentado, valorBarato = Double.MAX_VALUE, valorCaro = Double.MIN_VALUE;
        double mediaSaumento, mediaCaumento;
        Scanner dados = new Scanner(System.in);
        while(true){
            System.out.println("DIGITE O CODIGO DO PRODUTO OU 0 (ZERO) PARA ENCERRAR : ");
            codigo = dados.nextInt();
            if(codigo == 0){
                break;
            }
            contadorGeral++;
            System.out.println("DIGITE O VALOR DO PRODUTO: ");
            valor = dados.nextDouble();

            System.out.println("DIGITE O PERCENTUAL DE AUMENTO:");
            percenAumento = dados.nextDouble();

            if(percenAumento == 0){
                contadorSAumento++;
            }else{
                contadorCAumento++;
            }

            valorAumentado = valor + (valor * percenAumento / 100);
            if(valor < 100 && valorAumentado > 100){
                contadorMcem++;
            }
            if(percenAumento > 5){
                contadoAumen5++;
            }
            if(valorAumentado < valorBarato){
                valorBarato = valorAumentado;
            }
            if(valorAumentado > valorCaro){
                valorCaro = valorAumentado;
            }
            System.out.printf("O novo valor do produto é %.2f e o aumento de %.2f porcento. %n", valorAumentado, percenAumento);
        }

        mediaCaumento = (double) contadorSAumento / contadorGeral;
        mediaSaumento = (double) contadorCAumento / contadorGeral;

        System.out.println("A quantidade de produtos que com o aumento ficou mais caro que 100R$ foi : " + contadorMcem);
        System.out.println("A quantidade de produtos que receberam mais de 5% de aumento foi: " + contadoAumen5);
        System.out.printf("A media dos produtos que receberam aumento foi: %.2f %n ", mediaCaumento);
        System.out.printf("A media dos produtos que não receberam aumento foi: %.2f %n ", mediaSaumento);

    }
}
