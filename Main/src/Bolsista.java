public class Bolsista extends Aluno{

    private double bolsa;

    public Bolsista(String cpf, String nome, int idade, String matricula){
        super(cpf, nome, idade, matricula);
        this.bolsa = 70;
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com desconto de " + bolsa + "% pelo aluno: " + getNome() );
    }
}
