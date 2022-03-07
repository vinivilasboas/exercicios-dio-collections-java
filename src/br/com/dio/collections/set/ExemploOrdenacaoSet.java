package br.com.dio.collections.set;

import java.util.*;

/**
 *
 * @author vinivilasboas
 */

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>();
        minhasSeries.add(new Serie("The Office", "comédia", 25));
        minhasSeries.add(new Serie("Arcane", "fantasia", 45));
        minhasSeries.add(new Serie("Dark", "suspense", 60));

        Set<Serie> minhasSeriesInsercao = new LinkedHashSet<>();
        minhasSeriesInsercao.add(new Serie("The Office", "comédia", 25));
        minhasSeriesInsercao.add(new Serie("Arcane", "fantasia", 45));
        minhasSeriesInsercao.add(new Serie("Dark", "suspense", 60));

        Set<Serie> minhasSeriesOrdemTempo = new TreeSet<>(minhasSeries);

        Set<Serie> minhasSeriesOrdenada = new TreeSet<>(new ComparatorNomeGeneroTempoDeEpisodio());
        minhasSeriesOrdenada.addAll(minhasSeries);

        Set<Serie> minhasSeriesOrdemGenero = new TreeSet<>(new ComparatorGenero());
        minhasSeriesOrdemGenero.addAll(minhasSeries);

        System.out.println("--\tOrdem aleatória\t--");
        System.out.println(minhasSeries);

        System.out.println("--\tOrdem de inserção\t--");
        System.out.println(minhasSeriesInsercao);

        System.out.println("--\tOrdem por tempo de episódio\t--");
        System.out.println(minhasSeriesOrdemTempo);

        System.out.println("--\tOrdem por nome/gênero/tempo de episódio\t--");
        System.out.println(minhasSeriesOrdenada);

        System.out.println("--\tOrdem por gênero\t--");
        System.out.println(minhasSeriesOrdemGenero);

    }

}

class ComparatorNomeGeneroTempoDeEpisodio implements Comparator<Serie> {


    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoDeEpisodio(), s2.getTempoDeEpisodio());
    }

}

class ComparatorGenero implements Comparator<Serie> {


    @Override
    public int compare(Serie s1, Serie s2) {
        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        return Integer.compare(s1.getTempoDeEpisodio(), s2.getTempoDeEpisodio());
    }

}