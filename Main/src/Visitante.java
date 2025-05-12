public class Visitante extends Pessoa{

    public Visitante(String cpf, String nome, int idade){
        super(cpf, nome, idade);
    }

    public void Visitar(){
        System.out.println("O visitante " + getNome() + " está a dar uma volta no campus.");
    }
}