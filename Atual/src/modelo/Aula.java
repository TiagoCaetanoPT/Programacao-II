package modelo;

import java.util.LinkedList;

public class Aula extends Identificador {
    //    private String nome;
//    private long numero;
    private StringBuilder sumario;
    private LinkedList<Aluno> alunos;
    private Professor professor;
    private Horario horario;
    private Sala sala;

    /*
    public Aula(String nome, long numero) {  //o construtor tem de ter todas as variaveis iniciadas
        this.nome = nome;
        this.numero = numero;
        this.sumario = new String();
        this.professor = null;
        this.alunos = new LinkedList<>();
    }
    */
    // versao melhorada do public Aula (de cima)

    public Aula(String nome, long numero, Horario horario) {
        this(nome, numero, horario, null, new LinkedList<>());
    }

    public Aula(String nome, long numero, Horario horario, Professor professor, LinkedList<Aluno> alunos) {
//        this.nome = nome;
//        this.numero = numero;

        super(nome, numero);
        this.sumario = new StringBuilder();
        setProfessor(professor);    //atribuir um professor que ja foi criado
        this.alunos = new LinkedList<>(alunos);  // tinha-me esquecido de iniciar todas as variaveis
        for (Aluno aluno : alunos) {
            adicionar(aluno);      // correr o ciclo de alunos e adicionar alunos
            this.horario = horario;
            this.sala= null;
        }
    }

    public void remover(Aluno aluno) {
        if (aluno == null || !alunos.contains(aluno)) {
            return;
        }
        alunos.remove(aluno);  // remover da lista
        aluno.remover(this);  // aluno ficou sem aula
    }

    public void desassociarProfessor() {
        if (professor == null) {   // com this é explicito
            return;
        }
        Professor professorARemover = this.professor;  //indicar qual professor tem que ser removido
        professor = null;
        professorARemover.remover(this);     // remover o professor que ja estava , para podermos adicionar o novo(noutra função)

    }

    public void adicionarLinhaSumario(String linha) {
        StringBuilder stringBuilder = new StringBuilder(sumario);  //cadeia de caracteress
        stringBuilder.append(linha).append("\n");                   //


    }

    public void adicionar(Aluno aluno) {
        if (aluno != null || alunos.contains(aluno)) {
            return;
        }
        alunos.add(aluno);   //adicionar aluno
        aluno.associar(this); // a aula
    }

    public String getSumario() {
        return sumario.toString(); // converteu o sumario para .toString (depois da mudança usando o string Builder
    }

    public LinkedList<Aluno> getAlunos() {
        return new LinkedList<>(alunos);
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) { //associar o professor a aula
        if (professor == null || this.professor == professor) {  // se o professor for null ou professor igual ao mesmo
            return;
        }
        if (this.professor != null) {
            this.professor.remover(this);       // remover o professor da sua aula
        }
        this.professor = professor;
        professor.adicionar(this);

    }

    public Horario getHorario() {
        return horario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala){  //atribuir sala a uma aula
        if(sala == null || this.sala == sala){
            return;
        }
        if(this.sala != null){
            this.sala.remover(this);
        }
        this.sala=sala;
        sala.adicionar(this);
    }

    public void desassociarSala(){
        if(sala == null){
            return;
        }
        Sala salaARemover = sala;
        sala=null;
        salaARemover.remover(this);
    }
}


