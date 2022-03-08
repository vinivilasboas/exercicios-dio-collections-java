package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vinivilasboas
 */

public class ex002 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?");
        respostas.add(scan.nextLine().toUpperCase());

        System.out.println("Esteve no local do crime?");
        respostas.add(scan.nextLine().toUpperCase());

        System.out.println("Mora perto da vítima?");
        respostas.add(scan.nextLine().toUpperCase());

        System.out.println("Devia para a vítima?");
        respostas.add(scan.nextLine().toUpperCase());

        System.out.println("Já trabalhou com a vítima?");
        respostas.add(scan.nextLine().toUpperCase());

        int cont = 0;
        for (String resposta : respostas) {
            if (resposta.equals("SIM")) cont++;
        }

        switch (cont) {
            case 0, 1 -> System.out.println("INOCENTE!");
            case 2 -> System.out.println("SUSPEITA!");
            case 3, 4 -> System.out.println("CÚMPLICE!");
            case 5 -> System.out.println("ASSASSINA!");
        }

    }

}
