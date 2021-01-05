package Carro;

public class Principal2 {

    /* Variáveis referenciam objetos */

    public static void main(String[] args) {


       Carro meuCarro = new Carro();
       // meuCarro.modelo = "palio";

       Carro seuCarro = new Carro();
       seuCarro.modelo = "Civic";

       meuCarro.ligar();
       seuCarro.ligar();



    }
}