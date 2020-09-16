/**
 * Modificadores de acesso
 * 1 public = todas as classes terao acesso
 * 2 private = apenas pode ser acessado de dentro da classe
 * 3 protected = pode ser acessado estando dentro do mesmo pacote ou subclasses
 * 4 default = caso nao tenha sido definido nenhum modificador,
 * permitindo o acesso dentro do pacote
*/
public class Conta {

    //atributos
    private int numeroConta;
    private double saldo = 100;

    //metodos

    public double recuperarSaldo(){
        return this.saldo;
    }

    public void depositar(double valorDeposito ){
        this.saldo = this.saldo + valorDeposito;

    }
    public void sacar(double valorSaque) {
        this.saldo = this.saldo - valorSaque;
    }




}
