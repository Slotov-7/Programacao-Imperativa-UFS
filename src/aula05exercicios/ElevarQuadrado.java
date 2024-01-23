package aula05exercicios;

import java.util.Scanner;

public class ElevarQuadrado {
	 public static void main(String[] args) {
	        Scanner Infonumero = new Scanner(System.in);// cria um scanner para o número
	        
	        try{
	            System.out.println("Digite um número inteiro : ");
	            int numero = Infonumero.nextInt();// recebe o número
	            int potencia = numero * numero;// calcula o quadrado do número
	            System.out.printf("O quadrado do número digitado é : %d\n", potencia);// mostra o quadrado do número
	        }
	        finally{
	            Infonumero.close();
	        }
	    }
}
