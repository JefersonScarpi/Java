public class Cao extends Animal{
    //Propriedade Classe filha

    //metodos
    public void latir(){
        System.out.println( "Latir como um cao" );
    }
    //Sobrescrevendo metodo
    public void correr(){
        super.correr();
        System.out.println( "cao");
    }
}
