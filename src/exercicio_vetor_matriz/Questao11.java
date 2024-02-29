package exercicio_vetor_matriz;
/*Faça um programa que plote na tela as seguintes imagens:*/
public class Questao11 {
    public static void main(String[] args) {
        char[][] matrizDesenho = new char[12][12];

        /*for(int i = 0; i < matrizDesenho.length; i++){//superior triangular, começa na primeira linha.
            for(int j = i; j < matrizDesenho.length; j++){
                matrizDesenho[i][i] = '*';
                System.out.print(matrizDesenho[i][i]);
            }
            System.out.println();
        }
        for(int i = matrizDesenho.length - 1; i >= 0; i--){//vai comecar da ultima linha
            for(int j = i; j < matrizDesenho.length ; j++){
                matrizDesenho[i][i] = '*';
                System.out.print(matrizDesenho[i][i]);
            }
            System.out.println();
        }*/
        for(int i = 0; i < matrizDesenho.length; i++){
            for (int j = 0; j < matrizDesenho.length; j++){
                matrizDesenho[i][j] = '*';
                System.out.print(matrizDesenho[i][j]);
            }
            System.out.println();
        }

    }
}



