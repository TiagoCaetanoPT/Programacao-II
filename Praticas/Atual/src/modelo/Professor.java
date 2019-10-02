package modelo;

import java.util.LinkedList;

public class Professor extends Pessoa {
//    private String nome;
//    private long numero;
//    private LinkedList<Aula> aulas;

    public Professor(String nome, long numero) {
//        this.nome = nome;
//        this.numero = numero;               //iniciar sempre todos os atributos
        //codigo em comum nas classes usar o super (herança)
        this(nome, numero, new LinkedList<>());

    }

    public Professor(String nome, long numero, LinkedList<Aula> aulas) {
        super(nome, numero, aulas);
    }

    @Override
    protected void associar(Aula aula) {
        aula.setProfessor(this);
    }

    @Override
    protected void dessassociar(Aula aula) {
        aula.desassociarProfessor();
    }

    @Override
    protected void escreverSumario(Aula aula) {
        aula.adicionarLinhaSumario(aula.getNome());
        aula.adicionarLinhaSumario(String.valueOf(aula.getNumero()));
        assinarSumario(aula);
        for (Aluno aluno : aula.getAlunos()) {
            aluno.preencherSumario(aula);
        }
    }

    public LinkedList<Aula> getAulas() {
        return aulas;
    }

    public LinkedList<Aula> getAulas(Horario horario) {
        return aulas;
    }

    public void abrir(Sala sala){
        if (sala.isAberta()) {
            return;
        }
        sala.abrir();
    }
    public void fechar(Sala sala){
        if (!sala.isAberta()) {
            return;
        }
        sala.fechar();
    }


}


//    @Override
//    public void associar(Aula aula) {
//        super.adicionar(aula);      //bloco de codigo repetido criado na classe pessoa
//        aula.setProfessor(this);
//    }

//@Override
//    public void remover(Aula aula) {
////        if(!aulas.contains(aula)) {     //bloco de codigo repetido criado na classe pessoa
////            return;
////        }
//        super.remover(aula);
//        aula.desassociarProfessor();//DESSASSOCIAR a aula criada
////        aulas.remove(aula);
//    }