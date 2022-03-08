package br.com.dio.collections.map;

import java.util.Random;

/**
 *
 * @author vinivilasboas
 */

public class ex002 {

    public static void main(String[] args) {
        int dado;
        int[] lado = new int[6];

        System.out.println("VAMOS JOGAR O DADO 100 VEZES!");

        for (int i = 0; i < 100; i++) {
            dado = new Random().nextInt(6) + 1;
            switch (dado) {
                case 1 -> lado[0] += 1;
                case 2 -> lado[1] += 1;
                case 3 -> lado[2] += 1;
                case 4 -> lado[3] += 1;
                case 5 -> lado[4] += 1;
                case 6 -> lado[5] += 1;
            }
        }

        System.out.println("Caiu:");
        for (int i = 0; i < 6; i++) {
            System.out.println(lado[i] + " vezes no número " + (i + 1));
        }

    }

}
