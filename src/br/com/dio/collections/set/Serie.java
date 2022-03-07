package br.com.dio.collections.set;

import java.util.Objects;

public class Serie implements Comparable<Serie> {

    private String nome, genero;
    private int tempoDeEpisodio;

    public Serie(String nome, String genero, int tempoDeEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoDeEpisodio = tempoDeEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTempoDeEpisodio() {
        return tempoDeEpisodio;
    }

    @Override
    public String toString() {
        return "\n{" +
                "nome = " + nome + '\'' +
                ", gênero = " + genero + '\'' +
                ", duração dos episódios = " + tempoDeEpisodio + "m" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return tempoDeEpisodio == serie.tempoDeEpisodio && Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoDeEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoDeEpisodio = Integer.compare(this.getTempoDeEpisodio(), serie.getTempoDeEpisodio());
        int genero = this.getGenero().compareTo(serie.getGenero());

        if (tempoDeEpisodio != 0) return tempoDeEpisodio;

        return genero;
    }
}
