package Metodos01;

public class Exercicio09 {

    public static void main(String[] args) {
        String resultado = ConcatenarStrings("Olá", " Mundo!");
        System.out.println(resultado);
    }

    public static String ConcatenarStrings(String str1, String str2) {
        return str1 + str2;
    }
}
