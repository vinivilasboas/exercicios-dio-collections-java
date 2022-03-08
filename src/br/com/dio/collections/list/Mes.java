package br.com.dio.collections.list;

import java.util.Objects;

public class Mes {

    private String nome;
    private double temperatura;

    public Mes(String nome, double temperatura) {
        this.nome = nome;
        this.temperatura = temperatura;
    }

    public String getNome() {
        return nome;
    }

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mes mes = (Mes) o;
        return temperatura == mes.temperatura && nome.equals(mes.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, temperatura);
    }
}
