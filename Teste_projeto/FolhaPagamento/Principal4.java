package FolhaPagamento;

public class Principal4 {

    public static void main(String[] args){
        FolhaPagamento folha = new FolhaPagamento();
       double salario =  folha.caclularSalario(160, 12, 32.5, 40.2);
       System.out.println("Salário calculado: " + salario);
    }
}
