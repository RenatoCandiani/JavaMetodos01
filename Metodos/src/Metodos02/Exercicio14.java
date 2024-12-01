package Metodos02;

public class Exercicio14 {

    public static void main(String[] args) {
        double perimetro = CalcularPerimetroCirculo(3.0);
        System.out.println("O perímetro do círculo é: " + perimetro);
    }

    public static double CalcularPerimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }
}
