package arthur.henrique.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiroImposto = 9.70 / 100;
        double segundoImposto = 37.35 / 100;
        double terceiroImposto = 49.50 / 100;
        double valorImposto = 0;
        if (salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiroImposto;

        }else if (salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundoImposto;
        }else {
            valorImposto = salarioAnual * terceiroImposto;
        }
        System.out.println(valorImposto);
    }
}
