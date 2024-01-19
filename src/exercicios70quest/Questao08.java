package exercicios70quest;

/*Leia 3 valores inteiros (X, Y, Z), determina e escreve o menor deles. */
import java.util.Scanner;
public class Questao08{
    public static void main(String[] args){
        Scanner valores = new Scanner(System.in);
        try{
            System.out.print("Digite o valor de X: ");
            int x = valores.nextInt();
            System.out.print("Digite o valor de Y: ");
            int  y = valores.nextInt();
            System.out.print("Digite o valor de Z: ");
            int z = valores.nextInt();
            if (x < y && x < z){
                System.out.println("O menor valor é: " + x);
            }
            else if (y < x && y < z){
                System.out.println("O menor valor é: " + y);
            }
            else{
                System.out.println("O menor valor é: " + z);
            }
        }finally{
            valores.close();
        }
    }
}
