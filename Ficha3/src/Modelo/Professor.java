package Modelo;

import java.util.LinkedList;

public class Professor extends Pessoa {

    public Professor(String nome, long numero){
        // O super tem de ser sempre a 1ª linha
        super(nome, numero); // Herda da classe identificador
    }

    public void preencherSumario(Aula aula){
        super.preencherSumario(aula);

    }

    @Override
    protected void escreverSumario(Aula aula) {
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        aula.adicionarLinhaSumario(nome);
        for(Aluno aluno : aula.getAlunos()){
            aluno.preencherSumario(aula);
        }
    }

    @Override
    protected void associar(Aula aula) {
        aula.setProfessor(this);
    }

    public void remover(Aula aula){
        if(!aulas.contains(aula)) {
            return;
        }
        aula.desassociarProfessor();
        aulas.remove(aula);
    }


}
