package br.com.dio.collections.map;

import java.util.*;

/**
 *
 * @author vinivilasboas
 */

public class Ex001 {

    public static void main(String[] args) {

        Map<String, Integer> estadosBrasileiros = new HashMap<>();
        estadosBrasileiros.put("PE", 9616621);
        estadosBrasileiros.put("AL", 3351543);
        estadosBrasileiros.put("CE", 9187103);
        estadosBrasileiros.put("RN", 3534265);

        Map<String, Integer> estadosBrasileirosOrdemDeInsercao = new LinkedHashMap<>();
        estadosBrasileirosOrdemDeInsercao.put("PE", 9616621);
        estadosBrasileirosOrdemDeInsercao.put("AL", 3351543);
        estadosBrasileirosOrdemDeInsercao.put("CE", 9187103);
        estadosBrasileirosOrdemDeInsercao.put("RN", 3534265);

        for (Map.Entry<String, Integer> estado : estadosBrasileiros.entrySet()) {
            System.out.println("\nEstado = " + estado.getKey() + " - População = " + estado.getValue());
        }

        System.out.println("\nSubstitua a população do RN por 3534165");
        estadosBrasileiros.put("RN", 3534165);
        for (Map.Entry<String, Integer> estado : estadosBrasileiros.entrySet()) {
            System.out.println("\nEstado = " + estado.getKey() + " - População = " + estado.getValue());
        }

        System.out.println("\nO estado PB está no dicionário? " + estadosBrasileiros.containsKey("PB"));

        if (!estadosBrasileiros.containsKey("PB")) estadosBrasileiros.put("PB", 4039277);

        for (Map.Entry<String, Integer> estado : estadosBrasileiros.entrySet()) {
            System.out.println("\nEstado = " + estado.getKey() + " - População = " + estado.getValue());
        }

        System.out.println("\nExiba a população de PE: " + estadosBrasileiros.get("PE"));

        System.out.println("\nExiba os estados e suas populações na ordem em que foram informados");
        for (Map.Entry<String, Integer> estado : estadosBrasileirosOrdemDeInsercao.entrySet()) {
            System.out.println("\nEstado = " + estado.getKey() + " - População = " + estado.getValue());
        }

        System.out.println("\nExiba os estados e suas populações em ordem alfabética");
        Map<String, Integer> estadosBrasileirosOrdemAlfabetica = new TreeMap<>(estadosBrasileiros);
        for (Map.Entry<String, Integer> estado : estadosBrasileirosOrdemAlfabetica.entrySet()) {
            System.out.println("\nEstado = " + estado.getKey() + " - População = " + estado.getValue());
        }

        System.out.println("\nExiba o estado com a menor população e sua quantidade: "
                + Collections.min(estadosBrasileiros.keySet()) + " " + Collections.min(estadosBrasileiros.values()));

        System.out.println("\nExiba o estado com a maior população e sua quantidade: "
                + Collections.max(estadosBrasileiros.keySet()) + " " + Collections.max(estadosBrasileiros.values()));

        int soma = 0;
        Iterator<Integer> iterator = estadosBrasileiros.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma da população dos estados: " + soma);

        System.out.println("\nExiba a média da população dos estados: " + (soma / estadosBrasileiros.size()));

        System.out.println("\nRemova os estados com a população menor que 4 milhões");
        estadosBrasileiros.values().removeIf(next -> next < 4000000);
        for (Map.Entry<String, Integer> estado : estadosBrasileiros.entrySet()) {
            System.out.println("\nEstado = " + estado.getKey() + " - População = " + estado.getValue());
        }

        System.out.println("\nApague o dicionário");
        estadosBrasileiros.clear();

        System.out.println("\nDicionário está vazio? " + estadosBrasileiros.isEmpty());

    }

}