package br.com.dio.collections.map;

import java.util.*;

/**
 *
 * @author vinivilasboas
 */

public class ExemploOrdenacaoMap {

    public static void main(String[] args) {

        Map<String, Livro> meusLivros = new HashMap<>();
        meusLivros.put("Márquez, Gabriel García", new Livro("Cem Anos de Solidão", 448));
        meusLivros.put("Andrade, Carlos Drummond de", new Livro("A Rosa do Povo", 200));
        meusLivros.put("Liev Tolstói", new Livro("Guerra e Paz", 1544));

        Map<String, Livro> meusLivrosOrdemInsercao = new LinkedHashMap<>();
        meusLivrosOrdemInsercao.put("Márquez, Gabriel García", new Livro("Cem Anos de Solidão", 448));
        meusLivrosOrdemInsercao.put("Andrade, Carlos Drummond de", new Livro("A Rosa do Povo", 200));
        meusLivrosOrdemInsercao.put("Liev Tolstói", new Livro("Guerra e Paz", 1544));

        System.out.println("=======================");
        System.out.println("--\tOrdem aleatória\t--");
        for (Map.Entry<String, Livro> livro: meusLivros.entrySet()) {
            System.out.println("Livro - " + livro.getValue().getNome()
            + " | Autor - " + livro.getKey() + " | Número de páginas - " + livro.getValue().getNumPaginas());
        }

        System.out.println("=========================");
        System.out.println("--\tOrdem de inserção\t--");
        for (Map.Entry<String, Livro> livro: meusLivrosOrdemInsercao.entrySet()) {
            System.out.println("Livro - " + livro.getValue().getNome()
                    + " | Autor - " + livro.getKey() + " | Número de páginas - " + livro.getValue().getNumPaginas());
        }

        System.out.println("========================");
        System.out.println("--\tOrdem de autores\t--");
        Map<String, Livro> meusLivrosOrdemAutores = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livro> livro: meusLivrosOrdemAutores.entrySet()) {
            System.out.println("Livro - " + livro.getValue().getNome()
                    + " | Autor - " + livro.getKey() + " | Número de páginas - " + livro.getValue().getNumPaginas());
        }

        System.out.println("=================================");
        System.out.println("--\tOrdem de nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivrosOrdemNome = new TreeSet<>(new ComparatorNome());
        meusLivrosOrdemNome.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivrosOrdemNome) {
            System.out.println("Livro - " + livro.getValue().getNome()
                    + " | Autor - " + livro.getKey() + " | Número de páginas - " + livro.getValue().getNumPaginas());
        }

        System.out.println("===================================");
        System.out.println("--\tOrdem por número de páginas\t--");
        Set<Map.Entry<String, Livro>> meusLivrosOrdemPaginas = new TreeSet<>(new ComparatorPagina());
        meusLivrosOrdemPaginas.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivrosOrdemPaginas) {
            System.out.println("Livro - " + livro.getValue().getNome()
                    + " | Autor - " + livro.getKey() + " | Número de páginas - " + livro.getValue().getNumPaginas());
        }

    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {


    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPagina implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Integer.compare(l1.getValue().getNumPaginas(), l2.getValue().getNumPaginas());
    }
}
