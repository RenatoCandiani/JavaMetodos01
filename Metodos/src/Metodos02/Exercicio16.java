package Metodos02;

public class Exercicio16 {

    public static void main(String[] args) {
        boolean ehPrimo = EhPrimo(11);
        System.out.println("O número é primo? " + ehPrimo);
    }

    public static boolean EhPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
