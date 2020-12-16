package Paciente;


import java.util.Scanner;

public class Principal3 {

    public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso: ");
       double peso1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite a altura: ");
        double altura1 = Double.parseDouble(entrada.nextLine());
        Paciente p = new Paciente();
            p.peso = peso1;
            p.altura = altura1;

        // chamando o metodo para caulcular

      IMC imc = p.calcularIndiceDeMassaCorporal();

      System.out.println("Abaixo do peso ideal: " + "Não");
        System.out.println("Peso ideal: " + "verdadeiro");
            System.out.println("Obeso: " + "sim");
                System.out.println("Grau de obesidade: " +  imc.grauDeObesidade);
      }
    }

