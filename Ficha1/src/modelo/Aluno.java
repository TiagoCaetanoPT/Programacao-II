package modelo;

import java.util.LinkedList;

public class Aluno {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    public Aluno(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
        aulas = new LinkedList<>();
    }

    public String getNome() {
        return nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void remover(Aula aula){

    }

    public void preencherSumario(Aula aula) {
    }

    public void adicionar(Aula aula) {
        if(aula == null || aulas.contains(aula)){
            return;
        }
        aulas.add(aula);
        aula.adicionar(this);
    }
}
