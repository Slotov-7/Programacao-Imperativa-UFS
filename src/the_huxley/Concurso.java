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
public class Concurso {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int vagas;
        char[] gabarito = new char[10];
        String nome;
        ConjuntoParticipantes participantes = new ConjuntoParticipantes();
        vagas = sc.nextInt();
        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = Character.toUpperCase(sc.next().charAt(0));
        }
        
        while(true) {
            nome = sc.next();
            if (nome.equals("*"))//condição de parada
                break;
            Participante participante = new Participante(nome);

            for (int i = 0; i < gabarito.length; i++) {
                char resposta = Character.toUpperCase(sc.next().charAt(0));//resposta do participante  e deixando em maiusculo
                participante.adicionarGabarito(i, resposta);//adiciona a resposta do participante

                if (gabarito[i] == participante.getRespostas(i))//verifica se a resposta do participante é igual ao gabarito
                    participante.adicionarAcerto();//adiciona um acerto
            }
            participantes.adicionarParticipante(participante);//adiciona o participante
        }

        Collections.sort(participantes.getParticipantes(), (x, y) -> x.getNome().compareTo(y.getNome()));
        Collections.sort(participantes.getParticipantes(), (x, y) -> y.getAcertos() - x.getAcertos());

        for (int i = 0; i < participantes.getParticipantes().size(); i++) {//imprime os participantes
            if (i <= vagas-1) {//verifica se o participante foi aprovado
                System.out.println(participantes.getParticipante(i).getNome() + " " + participantes.getParticipante(i).getAcertos() + " Aprovado(a)");//imprime o participante aprovado
            }
            else {
                System.out.println(participantes.getParticipante(i).getNome() + " " + participantes.getParticipante(i).getAcertos() + " Nao Aprovado(a)");//imprime o participante não aprovado
            }
        }
    }
}
class Participante {//participante do concurso
    private String nome;//nome do participante
    private final char[] respostas;//respostas do participante
    private int acertos;//acertos do participante

    public Participante() {
        this.respostas = new char[10];//respostas do participante
        this.acertos = 0;//inicialmente sem acertos
    }

    public Participante(String nome) {
        this();//chama o construtor sem argumentos
        this.nome = nome;//adiciona o nome do participante
    }

    public void adicionarGabarito(int i, char c) {
        this.respostas[i] = c;
    }//adiciona a resposta do participante

    public void adicionarNome(String nome) {
        this.nome = nome;//adiciona o nome do participante
    }

    public void adicionarAcerto() {
        this.acertos = this.acertos+1;//adiciona um acerto
    }
    public char getRespostas(int i) {
        return this.respostas[i];//retorna a resposta do participante
    }

    public int getAcertos() {
        return this.acertos;//retorna o numero de acertos
    }

    public String getNome() {
        return this.nome;//retorna o nome do participante
    }
}
class ConjuntoParticipantes {//conjunto de participantes
    private  ArrayList<Participante> participantes;//lista de participantes

    public ConjuntoParticipantes() {
        this.participantes = new ArrayList<>();//inicializa a lista de participantes
    }

    public void adicionarParticipante(Participante participante) {
        this.participantes.add(participante);//adiciona um participante
    }

    public ArrayList<Participante> getParticipantes() {
        return this.participantes;//retorna a lista de participantes
    }

    public Participante getParticipante(int i) {
        return this.participantes.get(i);//retorna um participante
    }
}
