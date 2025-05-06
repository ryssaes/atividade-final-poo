package Main.src;

public class Disciplina {
    private String codigo;
    private String nome;
    private String semestre;

    public Disciplina(String codigo, String nome, String semestre) {
        this.codigo = codigo;
        this.nome = nome;
        this.semestre = semestre;
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
}