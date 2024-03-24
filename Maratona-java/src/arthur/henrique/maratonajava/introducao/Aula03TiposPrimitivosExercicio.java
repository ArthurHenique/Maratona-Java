package arthur.henrique.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Arthur";
        String endereco = "Rua Desembargador Campos 143";
        double salario = 2500.12;
        String dataRecebimentoSalario = "27/08/23";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+",confirmo que recebi o salário de R$ "+salario+", na data "+dataRecebimentoSalario+".";

        System.out.println("Eu "+nome+", morando no endereço "+endereco);
        System.out.println("confirmo que recebi o salário de R$ "+salario+", na data "+dataRecebimentoSalario+".");
        System.out.println(relatorio);
    }
}
