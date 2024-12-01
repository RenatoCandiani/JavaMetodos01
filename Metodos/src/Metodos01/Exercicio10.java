package Metodos01;

public class Exercicio10 {

    public static void main(String[] args) {
        double media = CalcularMedia(7.5, 6.0, 9.0);
        System.out.println("A média é: " + media);
    }

    public static double CalcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
