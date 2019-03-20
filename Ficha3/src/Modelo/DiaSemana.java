package Modelo;

public enum DiaSemana {
    SEGUNDA_FEIRA("segunda-feira"),
    TERCA_FEIRA("terça-feira"),
    QUARTA_FEIRA("quarta-feira"),
    QUINTA_FEIRA("quinta-feira"),
    SEXTA_FEIRA("sexta-feira"),
    SABADO("sábado"),
    DOMINGO("domingo");

    private final String nome;

    DiaSemana(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
