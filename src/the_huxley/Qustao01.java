package the_huxley;

import java.util.*;

/*Em um determinado concurso as provas são objetivas, de múltipla escolha, onde cada questão possui cinco alterna-tivas
e somente uma correta. Para agilizar a correção e publicação do resultado a coordenação do concurso solicitou à equipe
de TI um programa para permitir a leitura do quantitativo de vagas, do gabarito, do nome de cada um dos participantes
e das respostas em cada uma das dez questões da prova.
Após a leitura destas informações, o programa deve imprimir, usando a formatação do exemplo:
a) A lista de candidatos, em ordem decrescente das notas (em caso de notas iguais, utilizar ordem alfabética dos nomes
para desempatar), suas respectivas notas (cada questão certa vale 1 ponto) e se o candidato foi aprovado ou não.
Observações:
• Cada questão possui 5 opções de resposta (A, B, C, D e E);
• Utilize os conceitos de dicionário e função para resolver a questão.*/
public class Qustao01 {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdVagas;
        System.out.println("Digite a quantidade de vagas:");
        qtdVagas = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o gabarito da prova:");
        String[] gabarito = scan.nextLine().split(" ");

        ArrayList<Candidatos> candidatos = new ArrayList<>();
        System.out.println("Digite o nome do candidato e as respostas da prova:");
        while (true){
            String respostas = scan.nextLine();
            if (respostas.equals("+")){
                break;
            }
        }




    }
}
class Candidatos{
    private String nome;
    private int pontuacao;
    public Candidatos(String nome, int pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
    }
}
