package Modelo;

import java.util.LinkedList;

public class Professor {
    private String nome;
    private long numero;
    private LinkedList<Aula> aulas;

    public Professor(String nome, long numero){
        this.nome = nome;
        this.numero = numero;
        this.aulas = new LinkedList<>();
    }

    public void preencherSumario(Aula aula){
        if(!aulas.contains(aula)){
            return;
        }
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        aula.adicionarLinhaSumario(nome);
        for(Aluno aluno : aula.getAlunos()){
            aluno.preencherSumario(aula);
        }
    }

    public void adicionar(Aula aula){
        if(aula == null || aulas.contains(aula)){
            return;
        }
        if(aula.getProfessor() != null){
            aula.desassociarProfessor();
        }
        aulas.add(aula);
        aula.setProfessor(this);
    }

    public void remover(Aula aula){
        if(!aulas.contains(aula)) {
            return;
        }
        aula.desassociarProfessor();
        aulas.remove(aula);
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

}
