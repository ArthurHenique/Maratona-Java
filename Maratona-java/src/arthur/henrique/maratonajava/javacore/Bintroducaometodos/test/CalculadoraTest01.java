package arthur.henrique.maratonajava.javacore.Bintroducaometodos.test;

import arthur.henrique.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("\nFinalizando CalculadoraTest01");
        calculadora.subtraiDoisNumeros();
    }
}
