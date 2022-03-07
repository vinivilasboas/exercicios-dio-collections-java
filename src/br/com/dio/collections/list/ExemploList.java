package br.com.dio.collections.list;

import javax.swing.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

/**
 *
 * @author vinivilasboas
 */


public class ExemploList {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        List<Double> notas2 = new LinkedList<>(notas);

        JOptionPane.showMessageDialog(null, notas.toString());

        JOptionPane.showMessageDialog(null, "Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        JOptionPane.showMessageDialog(null, "Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        JOptionPane.showMessageDialog(null, notas.toString());

        JOptionPane.showMessageDialog(null, "Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        JOptionPane.showMessageDialog(null, notas.toString());

        JOptionPane.showMessageDialog(null, "Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        /*JOptionPane.showMessageDialog(null, "Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota: notas) {
            JOptionPane.showMessageDialog(null, nota.toString());
        } */


        JOptionPane.showMessageDialog(null, "Exiba a terceira nota adicionada: " + notas.get(2));
        JOptionPane.showMessageDialog(null, notas.toString());

        JOptionPane.showMessageDialog(null, "Exiba a menor nota: " + Collections.min(notas));

        JOptionPane.showMessageDialog(null, "Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        JOptionPane.showMessageDialog(null, "Exiba a soma dos valores: " + soma);

        double media = soma / notas.size();
        JOptionPane.showMessageDialog(null, "Exiba a média dos valores: " + media);

        JOptionPane.showMessageDialog(null, "Remova a nota 0.0: ");
        notas.remove(0d);
        JOptionPane.showMessageDialog(null, notas.toString());

        JOptionPane.showMessageDialog(null, "Remova a nota na posição 0: ");
        notas.remove(0);
        JOptionPane.showMessageDialog(null, notas.toString());

        JOptionPane.showMessageDialog(null, "Remova as notas menores que 7: ");
        notas.removeIf(next -> next < 7);
        JOptionPane.showMessageDialog(null, notas.toString());

        JOptionPane.showMessageDialog(null, "Apague toda a lista: ");
        notas.clear();
        JOptionPane.showMessageDialog(null, notas.toString());

        JOptionPane.showMessageDialog(null, "Está vazia? " + notas.isEmpty());

        JOptionPane.showMessageDialog(null, "Mostre a primeira nota da segunda lista: " + notas2.get(0));

        JOptionPane.showMessageDialog(null, "Mostre a primeira nota da segunda lista removendo-a: ");
        JOptionPane.showMessageDialog(null, notas2.get(0));
        notas2.remove(0);
        JOptionPane.showMessageDialog(null, notas2.toString());

    }

}
