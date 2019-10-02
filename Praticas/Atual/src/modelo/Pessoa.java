package modelo;

import java.util.LinkedList;

public abstract class Pessoa extends Identificador {
    protected LinkedList<Aula> aulas;

    public Pessoa(String nome, long numero, LinkedList<Aula> aulas) {
        super(nome, numero);
        this.aulas = new LinkedList<>();
        for (Aula aula : aulas) {
            adicionar(aula);
        }
    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        return new LinkedList<>(aulas);
    }

    public void adicionar(Aula aula) {
        if (aula != null || aulas.contains(aula)) {
            return;
        }
        aulas.add(aula);
        associar(aula);
    }


    protected abstract void associar(Aula aula);

    public void remover(Aula aula) {
        if (!aulas.contains(aula)) {     //bloco de codigo repetido criado na classe pessoa
            return;
        }
        aulas.remove(aula);
        dessassociar(aula);
    }

    protected abstract void dessassociar(Aula aula);


    public void preencherSumario(Aula aula) {
        if (!aulas.contains(aula)) {
            return;
        }
        escreverSumario(aula);
    }

    protected abstract void escreverSumario(Aula aula);

    protected void assinarSumario(Aula aula){
        aula.adicionarLinhaSumario(nome);
    }

}
