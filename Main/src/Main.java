package Main.src;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("D001", "Programação Orientada a Objetos", "2025.1");
        Professor professor = new Professor("Prof. Ana", "Centro de Tecnologia");

        Aluno aluno1 = new Aluno("João", "A001");
        Aluno aluno2 = new Aluno("Maria", "A002");

        Turma turma = new Turma("T01", disciplina, professor);
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        turma.imprimirInformacoes();
    }
}