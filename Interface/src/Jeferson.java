public class Jeferson extends Cidadao implements Presidente{

    //emplementação de metodo obrigatório por causa da interface
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleçao no Brasil");
    }
}
