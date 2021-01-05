package Testes;

import java.util.Scanner;

public class TesteEncapsulamento {

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        Scanner entrada = new Scanner(System.in);

          int tempAtual;


            do  {
             System.out.println("Temperatura:  ");
             tempAtual = entrada.nextInt();

                 ar.trocarTemperatura(tempAtual);

                             if (ar.obterTemperatura() >= 17){
                System.out.println("temperatura do ar: " + ar.obterTemperatura() + "°C");

            } else {
                System.out.println("erro");
            }

        }while (tempAtual != 0); {
            System.out.println("encerrado");
        }



    }
}
