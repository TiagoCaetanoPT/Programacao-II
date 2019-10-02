package modelo;

import java.util.LinkedList;

public class Sala {
    private String nome;
    private LinkedList<Aula> aulas;
    private boolean aberta;

    public Sala(String nome){
        this(nome,new LinkedList<>(), false);

    }
    public Sala(String nome, LinkedList<Aula> aulas, boolean aberta) {
        this.nome = nome;
        this.aulas = new LinkedList<>();
        for (Aula aula : aulas) {
            adicionar(aula);
        }
        this.aberta = aberta;

    }

    public LinkedList<Aula> getAulas() {
        return new LinkedList<>(aulas);
    }

    public String getNome() {
        return nome;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void adicionar(Aula aula){
        if(aula == null || aulas.contains(aula)){
            return;
        }
        aulas.add(aula);
        aula.setAula(this);
    }

    public void remover(Aula aula){
        if(!aulas.contains(aula)){
            return;
        }
        aulas.remove(aula);
        aula.desassociarSala();
    }
    public void abrir(){
        aberta = true;
    }

    public void fechar(){
        aberta = false;
    }
}
