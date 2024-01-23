package aula05exercicios;

public class ResultadoExpressoes {
	public static void main(String[] args) {
        //declaração das variáveis
        int x, y, z;
        x = 2;
        y = 5;
        z = 7;
        boolean find = false;

        //declaração das expressões
        float expression = (float) (x + 5) / z;
        boolean expression2 = x > y;
        boolean expression3 = (x > 0) || (y < 7);
        boolean expression4 = ! ((x > 0) && (y < 7));
        boolean expression5 = ! find;
        float expression6 = (float) y / x;
        int expression7 = z % x;
        float expression8 = (float) (x + y) / x;
        boolean expression9 = (y%x)==y-(y/x)*x;

        //impressão dos resultados
        System.out.printf("O resultado da expressão 1 é: %.2f\n", expression);
        System.out.printf("O resultado da expressão 2 é: %b\n", expression2);
        System.out.printf("O resultado da expressão 3 é: %b\n", expression3);
        System.out.printf("O resultado da expressão 4 é: %b\n", expression4);
        System.out.printf("O resultado da expressão 5 é: %b\n", expression5);
        System.out.printf("O resultado da expressão 6 é: %.2f\n", expression6);
        System.out.printf("O resultado da expressão 7 é: %d\n", expression7);
        System.out.printf("O resultado da expressão 8 é: %.2f\n", expression8);
        System.out.printf("O resultado da expressão 9 é: %b\n", expression9);

        
    }
}
