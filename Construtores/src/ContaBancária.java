public class ContaBancária {

    private int numeroConta;
    private double saldo;

    //Construtor
    public ContaBancária(){
        System.out.println(" Construtor chamado ");
    }


    //Sobrecarga de Construtor - assinatura de metodo
    public ContaBancária(int nConta){
        System.out.println( nConta );
    }

}
