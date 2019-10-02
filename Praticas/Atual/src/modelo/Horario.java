package modelo;

public class Horario {
    private DiaSemana diaSemana;
    private int horaInicio;
    private int duracao;


    public Horario(DiaSemana diaSemana, int horaInicio, int duracao) {
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.duracao = duracao;
    }


    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getDuracao() {
        return duracao;
    }


    public boolean intercetarAula(Aula aula) {
        if (diaSemana == aula.getHorario().getDiaSemana()) {
            int inicioAula = aula.getHorario().getHoraInicio();
            int fimAula = aula.getHorario().getHoraInicio() + aula.getHorario().getDuracao();  // fim da aula = o inicio da aula mais a duração da aula
            int inicioThis = horaInicio;
            int fimThis = horaInicio + duracao; // explicitamente

            if (!(inicioAula < inicioThis && fimAula <= fimThis || inicioAula > inicioThis && fimThis <= inicioAula)) {
                return true; // intersetou a aula a mesma hora
            }
        }
        return false;
    }
}

//    if(C){
//    return false
//    }
//return true;

