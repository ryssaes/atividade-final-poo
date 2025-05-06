package Main.src;

public class Professor {
    private String nome;
    private String centro;

    public Professor(String nome, String centro) {
        this.nome = nome;
        this.centro = centro;
    }

    public String getNome() { return nome; }
    public String getCentro() { return centro; }
}