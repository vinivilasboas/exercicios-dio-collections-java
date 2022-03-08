package br.com.dio.collections.map;

import java.util.*;

public class ex003 {

    public static void main(String[] args) {

        Map<Integer, Contato> agenda = new HashMap<>();
        agenda.put(1, new Contato("Sara", 58145));
        agenda.put(4, new Contato("Lucca", 68712));
        agenda.put(6, new Contato("Luiggi", 23740));
        agenda.put(3, new Contato("Lorenzo", 48752));

        Map<Integer, Contato> agendaOrdemInsercao = new LinkedHashMap<>();
        agendaOrdemInsercao.put(1, new Contato("Sara", 58145));
        agendaOrdemInsercao.put(4, new Contato("Lucca", 68712));
        agendaOrdemInsercao.put(6, new Contato("Luiggi", 23740));
        agendaOrdemInsercao.put(3, new Contato("Lorenzo", 48752));

        System.out.println("Ordem aleatória");
        for (Map.Entry<Integer, Contato> pessoa: agenda.entrySet()) {
            System.out.println(pessoa.getKey() + " - Nome: " + pessoa.getValue().getNome() + " | Número: " + pessoa.getValue().getNumero());
        }

        System.out.println("Ordem de inserção");
        for (Map.Entry<Integer, Contato> pessoa: agendaOrdemInsercao.entrySet()) {
            System.out.println(pessoa.getKey() + " - Nome: " + pessoa.getValue().getNome() + " | Número: " + pessoa.getValue().getNumero());
        }

        System.out.println("Ordem ID");
        Map<Integer, Contato> agendaID = new TreeMap<>(agenda);
        for (Map.Entry<Integer, Contato> pessoa: agendaID.entrySet()) {
            System.out.println(pessoa.getKey() + " - Nome: " + pessoa.getValue().getNome() + " | Número: " + pessoa.getValue().getNumero());
        }

        System.out.println("Ordem número de telefone");
        /*Set<Map.Entry<Integer, Contato>> numeros = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
            }
        });*/

        /*Set<Map.Entry<Integer, Contato>> numeros = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> contato) {
                return contato.getValue().getNumero();
            }
        }));*/

        Set<Map.Entry<Integer, Contato>> numeros = new TreeSet<>(Comparator.comparing(
                contato -> contato.getValue().getNumero()));

        numeros.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> pessoa: numeros) {
            System.out.println(pessoa.getKey() + " - Nome: " + pessoa.getValue().getNome() + " | Número: " + pessoa.getValue().getNumero());
        }

        System.out.println("Ordem Nomes");
        Set<Map.Entry<Integer, Contato>> nomes = new TreeSet<>(Comparator.comparing(
                contato -> contato.getValue().getNome()
        ));
        nomes.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> pessoa: nomes) {
            System.out.println(pessoa.getKey() + " - Nome: " + pessoa.getValue().getNome() + " | Número: " + pessoa.getValue().getNumero());
        }

    }

}

/*class ComparatorNumeros implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }
}*/

/*
class ComparatorNomes implements Comparator<Map.Entry<Integer, Contato>> {


    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return c1.getValue().getNome().compareToIgnoreCase(c2.getValue().getNome());
    }
}*/
