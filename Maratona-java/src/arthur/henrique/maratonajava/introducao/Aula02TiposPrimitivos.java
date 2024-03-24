package arthur.henrique.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {
        // int, double. float, char, byte, short, long, boolean
        int idade = (int) 18000000000L;
        long numeroGrande = 1000000;
        double salarioDouble = 2800.0;
        float salarioFloat= (float) 2500.0D;
        byte idadeByte = 18;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;
        String nome = "GOKU";
        var nome2 = "VEGETA";
        System.out.println("A idade é: "+idade+" anos!");
        System.out.println(verdadeiro);
        System.out.println(salarioFloat);
        System.out.println("Meu nome é "+nome);
    }
}
