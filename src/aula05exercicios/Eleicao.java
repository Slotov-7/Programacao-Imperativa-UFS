package aula05exercicios;

import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        
        Scanner eleicaoInfo = new Scanner(System.in);
        try{
            System.out.println("Digite a quantidade de votos total: ");
            int totalVotos = eleicaoInfo.nextInt();

            System.out.println("Digite a quantidade de votos no candidato 1: ");
            int votosCandidato1 = eleicaoInfo.nextInt();
            
            System.out.println("Digite a quantidade de votos no candidato 2: ");
            int votosCandidato2 = eleicaoInfo.nextInt();

            System.out.println("Digite a quantidade de votos nulos: ");
            int votosNulos = eleicaoInfo.nextInt();

            System.out.println("Digite a quantidade de votos em branco: ");
            int votosBranco = eleicaoInfo.nextInt();

            double percentualVotosCandidato1 = (double) votosCandidato1 / totalVotos * 100;
            double percentualVotosCandidato2 = (double) votosCandidato2 / totalVotos * 100;
            double percentualVotosNulos = (double) votosNulos / totalVotos * 100;
            double percentualVotosBranco = (double) votosBranco / totalVotos * 100;

            System.out.printf("O candidato 1 teve %.2f%% dos votos.\n", percentualVotosCandidato1);
            System.out.printf("O candidato 2 teve %.2f%% dos votos.\n", percentualVotosCandidato2);
            System.out.printf("Os votos nulos foram %.2f%%.\n", percentualVotosNulos);
            System.out.printf("Os votos em branco foram %.2f%%.\n", percentualVotosBranco);
        }
        finally{
        	eleicaoInfo.close();
        }
    }
}
