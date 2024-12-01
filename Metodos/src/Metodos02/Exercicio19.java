package Metodos02;

public class Exercicio19 {

    public static void main(String[] args) {
        String invertida = InverterString("Java");
        System.out.println("String invertida: " + invertida);
    }

    public static String InverterString(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }
}
