package modelo;

import java.util.LinkedList;

public class Aula {
    private String nome;
    private long numero;
    private String sumario;
    private Professor professor;
    private LinkedList<Aluno> alunos;

    public Aula(String nome, long numero, String sumario, Professor professor) {
        this.nome = nome;
        this.numero = numero;
        this.sumario = "";
        professor = null;
        alunos = new LinkedList<>();
    }

    public void adicionarLinhaSumario(String linha) {

    }

    public void setProfessor(Professor professor) {
        if (professor == null || this.professor == professor){
            return;
        }

        if (this.professor != null){
            this.professor.remover(this);
        }

        this.professor = professor;
        professor.adicionar(this);
    }

    public void adicionar(Aluno aluno) {
        if(aluno == null || alunos.contains(aluno)){
            return;
        }
        alunos.add(aluno);
        aluno.adicionar(this);
    }

    public String getNome() {
        return nome;
    }

    public String getSumario() {
        return sumario;
    }

    public Professor getProfessor() {
        return professor;
    }

    public LinkedList<Aluno> getAlunos() {
        //return alunos;
        return new LinkedList<>(alunos);
    }

    public void remover(Aluno aluno){
        if (!alunos.contains(aluno)){
            return;
        }
        alunos.remove(aluno);
    }

    public void desassociarProfessor(){
        if (this.professor == null){
            return;
        }
        Professor professorARemover = professor;
        //professor.remover(this);
        professor = null;
        professorARemover.remover(this);
    }
}
