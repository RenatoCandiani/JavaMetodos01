package Metodos01;

public class Exercicio06 {

    public static void main(String[] args) {
        boolean resultado = EhPar(7);
        System.out.println("O número é par? " + resultado);
    }

    public static boolean EhPar(int numero) {
        return numero % 2 == 0;
    }
}
