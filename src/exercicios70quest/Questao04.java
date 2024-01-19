package exercicios70quest;

import java.util.Scanner;

public class Questao04 {
    public static void main (String[] args){
        Scanner numeros = new Scanner(System.in);
        try{
            System.out.print("Digite o primeiro número: ");
            double numeroUm = numeros.nextInt();
            System.out.print("Digite o segundo número:");
            double numeroDois = numeros.nextInt();
            System.out.print("Digite o terceiro número:");
            double numeroTres = numeros.nextInt();

            if(numeroUm > 0){
                double raiz = Math.pow(numeroUm, 0.5);
                System.out.printf("A raiz é %2f %n", raiz);
            }else{
                double potencia = Math.pow(numeroUm, 2);
                System.out.printf("A potência é %2.2f %n", potencia);
            }

            if (numeroDois > 10 & numeroDois < 100){
                System.out.println("O número está no intervalo permitido");
            } else {
                System.out.println("O núumero não está no intervalo permitido");
            }

            if(numeroTres < numeroDois){
                double diferenca = numeroDois - numeroTres;
                System.out.printf("A diferença é %2.2f", diferenca);
            } else{
                double add1anum = numeroTres + 1;
                System.out.printf("O número adicionado é %2.2f", add1anum);
            }
        }finally {
            numeros.close();
        }

    }
}
