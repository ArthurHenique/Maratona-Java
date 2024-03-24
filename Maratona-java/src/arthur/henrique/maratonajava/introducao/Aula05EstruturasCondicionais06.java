package arthur.henrique.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 10;
        switch (dia){
            case 1:
                System.out.println("Domingo: Final de semana!");
                break;
            case 2:
                System.out.println("Seg: Dia útil!");
                break;
            case 3:
                System.out.println("Ter: Dia útil!");
                break;
            case 4:
                System.out.println("Qua: Dia útil!");
                break;
            case 5:
                System.out.println("Qui: Dia útil!");
                break;
            case 6:
                System.out.println("Sex: Dia útil!");
                break;
            case 7:
                System.out.println("Sabado: Final de semana!");
                break;
            default:
                System.out.println("Opção invalída!");
        }

    }
}
