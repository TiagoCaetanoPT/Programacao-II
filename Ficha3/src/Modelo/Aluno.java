package Modelo;

import java.util.LinkedList;

public class Aluno extends Pessoa{

    public Aluno(String nome, long numero){
        // O super tem de ser sempre a 1ª linha
        super(nome, numero); // Herda da classe identificador
    }

    public void preencherSumario(Aula aula){
        if(!aulas.contains(aula)){
            return;
        }
        aula.adicionarLinhaSumario(nome);
    }

    @Override
    protected void associar(Aula aula) {
        aula.adicionar(this);
    }

    public void remover(Aula aula){
        if(!aulas.contains(aula)){
            return;
        }
        aulas.remove(aula);
        aula.remover(this);
    }
}
