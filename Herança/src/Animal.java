public class Animal {
    //Propriedade Classe Pai
    int tamanho;
    String cor;
    double peso;

    //Getter e Setter

    //Configurar uma cor Setter
    public void setCor(String cor) {
        this.cor = cor;
    }
    //Recuperar uma cor Setter
    public String getCor() {
        return this.cor;
    }

    //metodos
    public void dormir(){
        System.out.println( "Dormir como um animal");
    }
    public void correr(){
        System.out.println( "Correr como um ");
    }



}
