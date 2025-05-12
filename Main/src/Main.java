public class Main {
    public static void main(String[] args) {
        
        Aluno a = new Aluno("123", "Teste", 19, "Teste");
        a.pagarMensalidade();

        Professor professor = new Professor("123", "Teste", 19, "Teste");
        professor.darAula("Matemática");

        Regular r = new Regular("123", "Teste", 19, "Teste");
        r.pagarMensalidade();

        Bolsista b = new Bolsista("123", "Teste", 19, "Teste");
        b.pagarMensalidade();

        Visitante v = new Visitante("123", "Teste", 19);
        v.Visitar();
    }
}
