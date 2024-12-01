package Metodos02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio11 {

    public static void main(String[] args) {
        ExibirHoraAtual();
    }

    public static void ExibirHoraAtual() {
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        System.out.println("Hora atual: " + formato.format(new Date()));
    }
}
