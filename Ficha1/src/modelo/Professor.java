package modelo;

import java.util.LinkedList;

public class Professor {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    public Professor(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
        aulas = new LinkedList<>();
    }

    public String getNome(){
        return nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void preencherSumario(Aula aula) {
    }

    public void adicionar(Aula aula) {
        if(aula == null || aulas.contains(aula)){
            return;
        }
        aulas.add(aula);
        aula.setProfessor(this);
    }

    public void remover(Aula aula){
        if(!aulas.contains(aula)){
            return;
        }
        aulas.remove(aula);
        aula.desassociarProfessor();
    }
}
