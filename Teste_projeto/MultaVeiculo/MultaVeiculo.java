package Veiculo;

import java.util.Scanner;

public class MultaVeiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("tipo de veiculo (passeio, caminhão)");
        String tipoVeiculo = entrada.nextLine();

        System.out.println("Velocidade maxima da via");
        int velocidadeMaxima = entrada.nextInt();

        System.out.println("Velocidade do veiculo");
        int velocidadeVeiculo = entrada.nextInt();

        if (tipoVeiculo.equals("passeio")) {
            if (velocidadeVeiculo > velocidadeMaxima * 1.1) {
                System.out.println("veiculo multado");
            } else if (velocidadeVeiculo <= velocidadeMaxima * 1.1) {
                System.out.println("veiculo liberado");
            }
        }

        if (tipoVeiculo.equals("caminhão")) {
            if (velocidadeVeiculo > velocidadeMaxima * 1.1) {
                System.out.println("veiculo multado");
            } else if (velocidadeVeiculo <= velocidadeMaxima * 1.1) {
                System.out.println("veiculo liberado");
            }
        }
    }