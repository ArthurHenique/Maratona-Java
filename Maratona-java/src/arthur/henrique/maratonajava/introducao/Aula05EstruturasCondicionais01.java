package arthur.henrique.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        //
        if (isAutorizadoComprarBebida != false){
            System.out.println("Autorizado a comprar bebida");
        }else{
            System.out.println("Não autorizado a comprar bebida");
        }
        if(isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida");
        }
    }

}
