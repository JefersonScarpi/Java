public class Principal {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(50);

        System.out.println(conta.recuperarSaldo());

    }
}
