package arthur.henrique.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte,short,int,long,float e double 0
        // char '\u0000' ' '
        //boolean false
        //Stribg null
        String [] nomes = new String[4];
        nomes[0] = "GOKU";
        nomes[1] = "NARUTO";
        nomes[2] = "LUFFY";
        nomes[3] = "HINATA";

        for (int i = 0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
    }
}
