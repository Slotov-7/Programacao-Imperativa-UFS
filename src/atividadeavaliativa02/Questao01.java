/*Uma determinada empresa armazena para cada funcionário uma ficha contendo o código, o número de
horas trabalhadas e o seu número de dependentes. Considere que a empresa paga R$20 por hora e R$35
por dependente. Sobre o salário são feitos descontos de 10,5% para o INSS e 11% para IR. Faça um
programa em Java para:
 (vale 0,4) Ler o código, número de horas trabalhadas e número de dependentes de cada
funcionário. A leitura de um código negativo encerra a leitura dos dados;
Depois de ler os dados de cada funcionário, calcule e imprima para cada funcionário:
 (vale 0,1) O código;
 (vale 1,5) Os valores descontados para cada tipo de imposto. Os valores devem ser exibidos com
2 casas decimais;
 (vale 2,0) O salário líquido com 2 casas decimais.*/
package atividadeavaliativa02;

import java.util.Scanner;


public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo, horasTrabalhadas, qtdDependentes;
        double salarioInicial = 0, inss = 0, impostoRenda = 0, salarioFinal = 0;

        while (true) {
            System.out.println("Informe o código do funcionário (negativo para encerrar): ");
            codigo = scanner.nextInt();
            if(codigo < 0){
                break;
            }
            System.out.println("Informe o número de horas trabalhadas: ");
            horasTrabalhadas = scanner.nextInt();

            System.out.println("Informe o número de dependentes: ");
            qtdDependentes = scanner.nextInt();

            salarioInicial = (horasTrabalhadas * 20) + (qtdDependentes * 35);
            inss = salarioInicial * 0.105;
            impostoRenda = salarioInicial * 0.11;
            salarioFinal = salarioInicial - inss - impostoRenda;

            System.out.println("Código: " + codigo);
            System.out.printf("Desconto INSS: %.2f\n", inss);
            System.out.printf("Desconto IR: %.2f\n", impostoRenda);
            System.out.printf("Salário líquido: %.2f\n", salarioFinal);
        }
        scanner.close();
    }
}
