package Paciente;

public class Paciente {

     double peso;
     double altura;

    IMC calcularIndiceDeMassaCorporal() {
        IMC imc = new IMC();
        double indice = peso / (altura * altura);

        if (indice < 18.5) {
            imc.abaixoDoPesoIdeal = true;
        } else if (indice < 25) {
            imc.pesoIdeal = true;
        } else {
            imc.obeso = true;

            if (indice <  30) {
                imc.grauDeObesidade = "Acima do peso";
            } else if (indice < 35) {
                imc.grauDeObesidade = "I";
            } else if (indice < 40) {
            imc.grauDeObesidade = "II";
            } else {
                imc.grauDeObesidade = "III";
            }
        }
return imc;
     }

}


