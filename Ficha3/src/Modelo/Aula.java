package Modelo;

import java.util.LinkedList;

public class Aula extends Identificador{
    // Atributos
    private String sumario;
    private Professor professor;
    LinkedList<Aluno> alunos;
    private Horario horario;

    public Aula(String nome, long numero, Horario horario, Professor professor, LinkedList<Aluno> alunos){
        // O super tem de ser sempre a 1ª linha
        super(nome, numero); // Herda da classe identificador
        this.sumario = "";
        setProfessor(professor);
        this.alunos = new LinkedList<>(alunos);
        this.horario = horario;

        for(Aluno aluno : alunos){
            adicionar(aluno);
        }
    }

    public Aula(String nome, long numero, Horario horario){
        this(nome, numero,  horario, null, new LinkedList<>());
    }

    public void adicionarLinhaSumario(String linha){
        StringBuilder sb = new StringBuilder(sumario);
        sb.append(linha).append("\n");
        sumario = sb.toString();
    }

    public void setProfessor(Professor professor) {
        if(professor == null || this.professor == professor){
            return;
        }
        if(this.professor != null){
            this.professor.remover(this);
        }
        this.professor = professor;
        professor.adicionar(this);
    }

    public void desassociarProfessor(){
        if(professor == null){
            return;
        }
        Professor professorAux = professor;
        professor = null;
        professorAux.remover(this);
    }

    public void adicionar(Aluno aluno){
        if(aluno == null || alunos.contains(aluno)){
            return;
        }
        alunos.add(aluno);
        aluno.adicionar(this);
    }

    public void remover(Aluno aluno){
        if(!alunos.contains(aluno)){
            return;
        }
        alunos.remove(aluno);
        aluno.remover(this);
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getSumario() {
        return sumario;
    }

    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<>(alunos);
    }


    public Horario getHorario(){
        return horario;
    }

}
