package Main.src;

import java.util.ArrayList;

public class Turma {
    private String codigo;
    private Disciplina disciplina;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Turma(String codigo, Disciplina disciplina, Professor professor) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.println("Alunos da Turma " + codigo + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " (Matrícula: " + aluno.getMatricula() + ")");
        }
    }

    public void imprimirInformacoes() {
        System.out.println("=== Turma " + codigo + " ===");
        System.out.println("Disciplina: " + disciplina.getNome() + " (" + disciplina.getCodigo() + ")");
        System.out.println("Professor: " + professor.getNome() + " - Centro: " + professor.getCentro());
        listarAlunos();
        System.out.println();
    }
}