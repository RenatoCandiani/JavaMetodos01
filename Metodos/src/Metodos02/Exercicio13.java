package Metodos02;

public class Exercicio13 {

    public static void main(String[] args) {
        double area = CalcularAreaRetangulo(5.0, 7.0);
        System.out.println("A área do retângulo é: " + area);
    }

    public static double CalcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }
}
