package Metodos02;

public class Exercicio15 {

    public static void main(String[] args) {
        int menor = ObterMenorNumero(8, 3, 5);
        System.out.println("O menor número é: " + menor);
    }

    public static int ObterMenorNumero(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
