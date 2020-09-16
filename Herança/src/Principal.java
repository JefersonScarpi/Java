public class Principal {
    public static void main(String[] args) {

        Cao cao = new Cao();
        cao.correr();
        cao.dormir();
        cao.latir();
        cao.setCor("Azul");
        System.out.println( cao.getCor() );

        System.out.println("---------------------------");

        Passaro passaro = new Passaro();
        passaro.correr();
        passaro.dormir();
        passaro.voar();
        passaro.setCor("Verde");
        System.out.println( passaro.getCor() );

    }
}
