package Metodos01;

public class Exercicio05 {

    public static void main(String[] args) {
        int maior = MaiorNumero(7, 15);
        System.out.println("O maior número é: " + maior);
    }

    public static int MaiorNumero(int a, int b) {
        return (a > b) ? a : b;
    }
}
