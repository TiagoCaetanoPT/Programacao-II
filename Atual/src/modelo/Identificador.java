package modelo;

public abstract class Identificador {
    //para dar acesso as outras classes
    protected String nome;
    protected long numero;

    public Identificador(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}
