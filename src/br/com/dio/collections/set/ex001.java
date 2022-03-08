package br.com.dio.collections.set;

import java.util.*;

/**
 *
 * @author vinivilasboas
 */

public class ex001 {

    public static void main(String[] args) {

        Set<String> cores = new HashSet<>();
        cores.add("vermelho");
        cores.add("laranja");
        cores.add("amarelo");
        cores.add("verde");
        cores.add("azul");
        cores.add("anil");
        cores.add("violeta");

        Set<String> coresOrdemInformada = new LinkedHashSet<>();
        coresOrdemInformada.add("vermelho");
        coresOrdemInformada.add("laranja");
        coresOrdemInformada.add("amarelo");
        coresOrdemInformada.add("verde");
        coresOrdemInformada.add("azul");
        coresOrdemInformada.add("anil");
        coresOrdemInformada.add("violeta");

        System.out.println("Exiba as cores do arco-íris");
        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("Quantas cores o arco-íris tem? " + cores.size());

        System.out.println("Exiba as cores em ordem alfabética");
        Set<String> coresOrdemAlfabetica = new TreeSet<>(cores);
        for (String cor : coresOrdemAlfabetica) {
            System.out.println(cor);
        }

        System.out.println("Exiba as cores na ordem inversa em que foram informadas");
        List<String> listaCores = new ArrayList<>(coresOrdemInformada);
        ListIterator<String> reverso = listaCores.listIterator(listaCores.size());
        while (reverso.hasPrevious()) {
            System.out.println(reverso.previous());
        }

        System.out.println("Exiba todas as cores que começam com a letra V");
        for (String cor : cores) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }

        }

        System.out.println("Remova as cores que começam com a letra V");
        cores.removeIf(next -> next.startsWith("v"));
        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("Limpe o conjunto");
        cores.clear();

        System.out.println("O conjunto está vazio? " + cores.isEmpty());

    }

}
