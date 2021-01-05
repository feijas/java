package EstruturaDoWhile;

import java.util.Scanner;

public class EstruturaDoWhile {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            int valor = 0;
            int soma = 0;

            do {
                System.out.println("Digite 0 para sair ou qualquer numero para somar: ");
                valor = entrada.nextInt();

                soma += valor;
                System.out.println("soma: " + soma);
                System.out.println("valor:" + valor);
            } while (valor != 0) ;

            }
        }




