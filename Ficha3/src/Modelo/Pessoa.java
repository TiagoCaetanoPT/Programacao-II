package Modelo;

import java.util.LinkedList;

public abstract class Pessoa extends Identificador {
    // Atributos
    protected LinkedList<Aula> aulas;

    public Pessoa(String nome, long numero) {
        super(nome, numero);
        this.aulas = new LinkedList<>();
    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        return aulas;
    }

    public void adicionar(Aula aula) {
        if (aula == null || aulas.contains(aula)) {
            return;
        }
        aulas.add(aula);
        associar(aula);
    }

    protected abstract void associar(Aula aula);


    public void preencherSumario(Aula aula) {
        if (aula == null || !aulas.contains(aula)) {
            return;
        }
        escreverSumario(aula);
    }

    protected abstract void escreverSumario(Aula aula);


}
