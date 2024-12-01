package Metodos02;

import java.util.Random;

public class Exercicio17 {

    public static void main(String[] args) {
        int numeroAleatorio = GerarNumeroAleatorio();
        System.out.println("Número aleatório gerado: " + numeroAleatorio);
    }

    public static int GerarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
