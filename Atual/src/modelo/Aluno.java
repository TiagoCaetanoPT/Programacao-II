package modelo;

import java.util.LinkedList;

public class Aluno extends Pessoa {
    // private String nome;
//    private long numero;
//    private LinkedList<Aula> aulas;
    public Aluno(String nome, long numero) {
//        this.nome = nome;
//        this.numero = numero;
        //igual ao professor , codigo em comum
        this(nome, numero, new LinkedList<>());
    }

    public Aluno(String nome, long numero, LinkedList<Aula> aulas) {
        super(nome, numero, aulas);

    }

    @Override
    public void associar(Aula aula) {
        aula.adicionar(this);
    }

    @Override
    protected void dessassociar(Aula aula) {
        aula.remover(this);
    }

    @Override
    protected void escreverSumario(Aula aula) {
       assinarSumario(aula);
    }

}

//    public void preencherSumario(Aula aula) {
////        if (!aulas.contains(aula)) {
////            return;
////        }
////        aula.adicionarLinhaSumario(nome);
////    }

//    public void remover(Aula aula){
//        if(!aulas.contains(aula)){
//            return;
//        }
//        aulas.remove(aula);
//        aula.remover(this);
//    }
