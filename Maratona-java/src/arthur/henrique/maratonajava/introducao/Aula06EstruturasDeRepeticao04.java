package arthur.henrique.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        //condicao valorParcela >=1000
        double valorTotal = 40000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
        double valorDaCasa = 50000;
        for (int boletos = 1; boletos <= valorDaCasa; boletos++) {
            double valorTotalCasa = valorDaCasa / boletos;
            if (valorTotalCasa < 1000) {
                break;
            }
            System.out.println("Boletos " + boletos + " R$ " + valorTotalCasa);
        }
    }
}
