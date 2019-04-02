package Modelo;

public abstract class Identificador {
    // Atributos
    // Protected para dar acesso às outras classes
    protected String nome;
    protected long numero;

    public Identificador(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() { return nome; }

    public long getNumero() { return numero; }

    public void setNumero(long numero) { this.numero = numero; }
}
