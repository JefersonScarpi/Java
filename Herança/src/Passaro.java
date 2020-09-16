public class Passaro extends Animal{
    //Propriedade Classe filha

    //metodos
    public void voar(){
        System.out.println( "Voar como passaro");
    }

    //Sobrescrevendo metodo
    public void correr(){
        super.correr();
        System.out.println( "passaro");
    }
}
