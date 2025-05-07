public class Professor extends Pessoa {
    private String centro;

    public Aluno (String cpf, String nome, int idade, String centro){
        super(cpf, nome, idade);
        this.centro = centro;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public void darAula(String materia){
        System.out.println("O professor está ministrando a disciplina de " + materia + ".");
    }
}