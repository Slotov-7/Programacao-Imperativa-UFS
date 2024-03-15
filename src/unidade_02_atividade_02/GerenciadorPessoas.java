package unidade_02_atividade_02;

import java.io.*;
import java.util.*;


public class GerenciadorPessoas implements Serializable {//classe GerenciadorPessoas implementa a interface Serializable
    private List<Pessoa> pessoas;//atributo do tipo List<Pessoa>

    public GerenciadorPessoas() {
        pessoas = new ArrayList<>();
    }//construtor da classe GerenciadorPessoas

    public void addPerson(long codigo, String nome) {//método para adicionar uma pessoa
        Pessoa pessoa = new Pessoa(codigo, nome);
        pessoas.add(pessoa);//adiciona uma pessoa a lista de pessoas
    }

    public void addBelonging(long pessoaCodigo, int codigo, String nome, double valor) {//método para adicionar um bem a uma pessoa
        for (Pessoa pessoa : pessoas) {//percorre a lista de pessoas
            if (pessoa.getCodigo() == pessoaCodigo) {//verifica se o código da pessoa é igual ao código passado como parâmetro
                Bem bem = new Bem(codigo, nome, valor);//instancia um novo bem
                pessoa.addBelonging(bem);//adiciona um bem a pessoa
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");//imprime uma mensagem caso a pessoa não seja encontrada
    }

    public void removePerson(long codigo) {//método para remover uma pessoa
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getCodigo() == codigo) {
                pessoas.remove(i);
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    public void removeBelonging(long pessoaCodigo, int codigo) {//método para remover um bem de uma pessoa
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == pessoaCodigo) {
                pessoa.removeBelonging(codigo);
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    public void listPersons() {//método para listar as pessoas
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public Pessoa getPerson(long codigo) {//método para retornar uma pessoa
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codigo) {
                return pessoa;
            }
        }
        System.out.println("Pessoa não encontrada.");
        return null;
    }

    public void saveData(String fileName) throws IOException {//método para salvar os dados
        FileOutputStream fileOut = new FileOutputStream(fileName);//instancia um novo FileOutputStream
        ObjectOutputStream out = new ObjectOutputStream(fileOut);//instancia um novo ObjectOutputStream
        out.writeObject(pessoas);//escreve a lista de pessoas no arquivo
        out.close();//fecha o ObjectOutputStream
        fileOut.close();//fecha o FileOutputStream
    }

    public void loadData(String fileName) throws IOException, ClassNotFoundException {//método para carregar os dados
        FileInputStream fileIn = new FileInputStream(fileName);//instancia um novo FileInputStream
        ObjectInputStream in = new ObjectInputStream(fileIn);//instancia um novo ObjectInputStream
        pessoas = (List<Pessoa>) in.readObject();//lê a lista de pessoas do arquivo
        in.close();//fecha o ObjectInputStream
        fileIn.close();//fecha o FileInputStream
    }
}
