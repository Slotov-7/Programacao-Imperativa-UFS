package exercicios01;

import java.util.Scanner; 

public class MarcasCarro {
    public static void main(String[] args) {
        Scanner infoCarros = new Scanner(System.in);// cria um scanner para receber as marcas dos carros
        try{
            System.out.println("Qual a marca do primeiro carro?"); 
            String carroUm = infoCarros.nextLine();// recebe a marca do primeiro carro
            System.out.println("Qual a marca do segundo carro?");
            String carroDois = infoCarros.nextLine();// recebe a marca do segundo carro
            System.out.println("Qual a marca do terceiro carro?");
            String carroTres = infoCarros.nextLine();// recebe a marca do terceiro carro
            System.out.printf("As marcas dos carros são: %s, %s e %s \n", carroUm, carroDois, carroTres);// mostra as marcas dos carros
        }finally{
        	infoCarros.close();
        }
    }
}
