package Metodos01;

public class Exercicio08 {

    public static void main(String[] args) {
        int fatorial = CalcularFatorial(5);
        System.out.println("O fatorial é: " + fatorial);
    }

    public static int CalcularFatorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
