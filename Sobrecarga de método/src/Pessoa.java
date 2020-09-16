public class Pessoa {

    private String nome;
    private int idade;


    //metodos
    public void exibirDados(String nome){
        System.out.println("Exibir apenas nome: " + nome );
    }
    //Sobrecarga de metodos
    public void exibirDados(String nome, int idade){
        System.out.println("nome: " + nome + " idade: " + idade );
    }


}
