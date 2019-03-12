package modelo;

import java.util.LinkedList;

public class Aula {
    private String nome;
    private long numero;
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    public Aula(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
        this.sumario = new String();
        this.professor = null;
        this.alunos = new LinkedList<Aluno>();
    }

    public String getNome() {
        return nome;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getSumario() {
        return sumario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<Aluno>(alunos);
    }

    public void remover(Aluno aluno) {

    }

    public void desassociarProfessor() {
        if (professor != null){
            return;
        }
        professor.remover(this);
        professor = null;
    }

    public void adicionar(Aula aula) {

    }

    public void adicionarLinhaSumario(String linha) {

    }

    public void setProfessor(Professor professor) {
        if (professor == null || this.professor == professor) {
            return;
        }
        if (this.professor != null) {
            this.professor.remover(this);
        }
        this.professor = professor;
        professor.adicionar(this);
    }

    public void adicionar(Aluno aluno) {

    }
}
