package arthur.henrique.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprimir o dia da semana, considerando 1 como domingo
        byte dia = 5;
        // charm, int, byte, short, enum, String
        switch (dia){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Ter");
                break;
            case 4 :
                System.out.println("Qua");
                break;
            case 5 :
                System.out.println("Qui");
                break;
            case 6 :
                System.out.println("Sex");
                break;
            case 7 :
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção inválida");
        }
        char sexo = 'F';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
