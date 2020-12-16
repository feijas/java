package FolhaPagamento;

public class FolhaPagamento {

    double caclularSalario (int horasNormais, int horasExtras, double valorHoraNormal, double valorHoraExtra) {

        double valorHoraNormais = horasNormais * valorHoraNormal;
        double valorHoraExtras = horasExtras * valorHoraExtra;

        return valorHoraNormais + valorHoraExtras;




    }
}
