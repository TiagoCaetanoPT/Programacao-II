package modelo;

public enum DiaSemana {
    SEGUNDA_FEIRA("Segunda-Feira"),
    TERCA_FEIRA("Terça-Feira"),
    QUARTA_FEIRA("Quarta-Feira"),
    QUINTA_FEIRA("Quinta-Feira"),
    SEXTA_FEIRA("Sexta-Feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");


    private final String nome;

    DiaSemana(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}

