package arthur.henrique.maratonajava.javacore.Aintroducaoclasses.test;

import arthur.henrique.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "McLaren";
        carro1.modelo = "Esportivo";
        carro1.ano = "15/01/2021";

        carro2.nome = "Mustang";
        carro2.modelo = "Esportivo";
        carro2.ano = "15/01/2000";

        carro2 = carro1;

        System.out.println(carro1.nome+" "+carro1.modelo+" "+carro1.ano);
        System.out.println(carro2.nome+" "+carro2.modelo+" "+carro2.ano);
    }
}
