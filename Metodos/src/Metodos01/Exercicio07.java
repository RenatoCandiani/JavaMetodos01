package Metodos01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio07 {

    public static void main(String[] args) {
        String dataAtual = ObterDataAtual();
        System.out.println("Data atual: " + dataAtual);
    }

    public static String ObterDataAtual() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(new Date());
    }
}
