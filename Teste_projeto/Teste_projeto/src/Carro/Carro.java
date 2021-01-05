package Carro;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;

    Proprietario dono;

    void alterarModelo(String modelo){
        if (modelo != null) {
            this.modelo = modelo;
        }

    }

    void ligar() {

        if (modelo != null) {
            // isso acontece quando não especifico meu "meuCarro no metodo principal2

            System.out.println("ligando o carro: " + modelo);

        }

    }
}