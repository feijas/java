package Produto;

public class Principal7 {

    public static void main(String [] args) {
        Televisor tv = new Televisor();

        // não deveria mudar o volume e canal


        tv.mudarVolume(20);
        tv.mudarCanal(130);

        //deveria mudar o

        tv.mudarVolume(300);
        tv.mudarCanal(10);

    }
}
