package exercicio_vetor_matriz;
/*Uma locadora de vídeos tem guardada, em um vetor de 500 posições, a quantidade de
filmes retirados por seus clientes durante o ano de 1993. Agora, esta locadora está
fazendo uma promoção e, para cada 10 filmes retirados, o cliente tem direito a uma
locação grátis. Faça um algoritmo que crie um outro vetor contendo a quantidade de
locações gratuitas a que cada cliente tem direito.*/

import java.util.*;

public class Questao07 {
    public static void main(String[] args) {
        int [] filmesRetirados = new int[500];
        int [] locacoesGratis = new int[500];
        Random rom = new Random();
        for (int i = 0; i < filmesRetirados.length; i++){
            filmesRetirados[i] = rom.nextInt(100);
            locacoesGratis[i] = filmesRetirados[i] / 10;
        }
        System.out.println(Arrays.toString(locacoesGratis));
    }
}
