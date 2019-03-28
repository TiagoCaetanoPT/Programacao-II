package modelo;

import java.util.LinkedList;

public class Aluno {

    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    public Aluno(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<Aula>();
    }

    public void preencherSumario(Aula aula) {

    }

    public String getNome() {
        return nome;
    }

    public Long getNumero() {
        return numero;
    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<Aula>(aulas);
    }

    public void remover(Aula aula){

    }

    public void adicionar(Aula aula) {

    }
}
