package Metodos02;

public class Exercicio18 {

    public static void main(String[] args) {
        double fahrenheit = ConverterCelsiusParaFahrenheit(100.0);
        System.out.println("100°C em Fahrenheit é: " + fahrenheit);
    }

    public static double ConverterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
