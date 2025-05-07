public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("123.456.789-00", "Leo", 23, "A12345");

        System.out.println("Aluno: " + aluno.getNome() + ", CPF: " + aluno.getCpf() + ", Idade: " + aluno.getIdade() + ", Matrícula: " + aluno.getMatricula());

        aluno.fazerAniversario();

        System.out.println(aluno.getNome() + " fez aniversário e agora tem " + aluno.getIdade() + " anos.");

        aluno.pagarMensalidade();
    }
}