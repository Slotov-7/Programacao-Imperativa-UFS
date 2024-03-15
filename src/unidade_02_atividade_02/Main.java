package unidade_02_atividade_02;

import java.io.*;
import java.util.*;


class Bem implements Serializable {
    private final int codigo;
    private final String nome;
    private final double valor;

    public Bem(int codigo, String nome, double valor) {
        this.codigo = codigo;//this.codigo é o atributo da classe Bem e codigo é o parâmetro do construtor
        this.nome = nome;//this.nome é o atributo da classe Bem e nome é o parâmetro do construtor
        this.valor = valor;//this.valor é o atributo da classe Bem e valor é o parâmetro do construtor
    }

    public int getCodigo() {
        return codigo;//retorna o valor do atributo codigo
    }

    public String getNome() {
        return nome;//retorna o valor do atributo nome
    }

    public double getValor() {
        return valor;//retorna o valor do atributo valor
    }

    @Override
    public String toString() {//sobrescreve o método toString
        return "Bem{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';//retorna uma string com os valores dos atributos
    }
}

class Pessoa implements Serializable {//classe Pessoa implementa a interface Serializable
    private final long codigo;//atributo final do tipo long
    private final String nome;//atributo final do tipo String
    private final List<Bem> bens;//atributo final do tipo List<Bem>

    public Pessoa(long codigo, String nome) {//construtor da classe Pessoa
        this.codigo = codigo;//this.codigo é o atributo da classe Pessoa e codigo é o parâmetro do construtor
        this.nome = nome;//this.nome é o atributo da classe Pessoa e nome é o parâmetro do construtor
        this.bens = new ArrayList<>();//instancia um novo ArrayList e atribui a bens
    }

    public long getCodigo() {
        return codigo;//retorna o valor do atributo codigo
    }

    public String getNome() {
        return nome;//retorna o valor do atributo nome
    }

    public void addBelonging(Bem bem) {
        bens.add(bem);//adiciona um bem a lista de bens
    }

    public void removeBelonging(int codigo) {
        bens.removeIf(bem -> bem.getCodigo() == codigo);//remove um bem da lista de bens
    }

    public double getTotalValueOfBelongings() {//método que retorna o valor total dos bens
        double total = 0;
        for (Bem bem : bens) {
            total += bem.getValor();
        }
        return total;
    }

    @Override
    public String toString() {//sobrescreve o método toString
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{")
                .append("codigo=").append(codigo)
                .append(", nome='").append(nome).append('\'')
                .append(", bens=[");//adiciona uma string ao StringBuilder
        for (Bem bem : bens){
            sb.append("\n  ").append(bem);//adiciona um bem ao StringBuilder
        }
        sb.append("\n], total=").append(getTotalValueOfBelongings()).append('}');//adiciona uma string ao StringBuilder
        return sb.toString();//retorna uma string com os valores dos atributos
    }
}

public class Main {
    public static void main(String[] args) {//método principal
        GerenciadorPessoas gerenciador = new GerenciadorPessoas();

        // Load data from disk
        try {
            gerenciador.loadData("todosDados.txt");//carrega os dados do arquivo data.txt
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());//imprime uma mensagem de erro
        }

        Scanner scanner = new Scanner(System.in);
        int opcao;//declaração da variável opcao

        do {//laço de repetição
            System.out.println("1. Inserir pessoa");
            System.out.println("2. Inserir bens de uma pessoa");
            System.out.println("3. Excluir pessoa");
            System.out.println("4. Excluir bem de uma pessoa");
            System.out.println("5. Listar pessoas com o valor total dos bens");
            System.out.println("6. Consultar pessoa");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {//estrutura de seleção
                case 1:
                    System.out.print("Código: ");
                    long codigo = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    gerenciador.addPerson(codigo, nome);//adiciona uma pessoa
                    break;
                case 2:
                    System.out.print("Código da pessoa: ");
                    long pessoaCodigo = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Código do bem: ");
                    int codigoBem = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do bem: ");
                    String nomeBem = scanner.nextLine();
                    System.out.print("Valor do bem: ");
                    double valorBem = scanner.nextDouble();
                    scanner.nextLine();
                    gerenciador.addBelonging(pessoaCodigo, codigoBem, nomeBem, valorBem);//adiciona um bem a pessoa
                    break;
                case 3:
                    System.out.print("Código da pessoa: ");
                    long codigoPessoa = scanner.nextLong();
                    gerenciador.removePerson(codigoPessoa);//remove uma pessoa
                    break;
                case 4:
                    System.out.print("Código da pessoa: ");
                    long pessoaCodigoBem = scanner.nextLong();
                    scanner.nextLine();
                    System.out.print("Código do bem: ");
                    int codigoBemRemover = scanner.nextInt();
                    gerenciador.removeBelonging(pessoaCodigoBem, codigoBemRemover);//remove um bem de uma pessoa
                    break;
                case 5:
                    gerenciador.listPersons();//lista as pessoas
                    break;
                case 6:
                    System.out.print("Código da pessoa: ");
                    long codigoPessoaConsultar = scanner.nextLong();
                    Pessoa pessoaConsultar = gerenciador.getPerson(codigoPessoaConsultar);//retorna uma pessoa
                    if (pessoaConsultar != null) {
                        System.out.println(pessoaConsultar);//imprime a pessoa
                    }
                    break;
                case 7:
                    System.out.println("Saindo...");//imprime uma mensagem
                    break;
                default:
                    System.out.println("Opção inválida.");//imprime uma mensagem caso não seja uma opção válida
            }
        } while (opcao != 7);//condição de saída do laço

        scanner.close();

        //salva os dados no arquivo todosDados.txt
        try {
            gerenciador.saveData("todosDados.txt");//salva os dados no arquivo todosDados.txt
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());//imprime uma mensagem de erro
        }
    }
}