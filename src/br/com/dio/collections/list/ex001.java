package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinivilasboas
 */

public class ex001 {

    public static void main(String[] args) {

        List<Mes> meses = new ArrayList<>();
        meses.add(new Mes("janeiro", 23.2));
        meses.add(new Mes("fevereiro", 25.1));
        meses.add(new Mes("março", 22.4));
        meses.add(new Mes("abril", 19d));
        meses.add(new Mes("maio", 16.7));
        meses.add(new Mes("junho", 13.5));

        for (Mes mes : meses) {
            System.out.println("Mês - " + mes.getNome() + " | Média - " + mes.getTemperatura() + "ºC");
        }

        Double soma = 0d;
        for (Mes mes : meses) {
            soma += mes.getTemperatura();
        }
        Double media = soma / meses.size();
        System.out.println("Média semestral das temperaturas: " + media + "ºC");

        System.out.println("Temperaturas acima da média: ");
        for (Mes mes : meses) {
            if (mes.getTemperatura() > media)
                System.out.println("Mês - " + mes.getNome() + " | Média - " + mes.getTemperatura() + "ºC");
        }

    }

}
