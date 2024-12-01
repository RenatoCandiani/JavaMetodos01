package Metodos02;

public class Exercicio20 {

    public static void main(String[] args) {
        double hipotenusa = CalcularHipotenusa(3.0, 4.0);
        System.out.println("A hipotenusa é: " + hipotenusa);
    }

    public static double CalcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
}
