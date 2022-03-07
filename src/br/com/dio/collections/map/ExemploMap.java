package br.com.dio.collections.map;

import java.util.*;

/**
 *
 * @author vinivilasboas
 */

public class ExemploMap {

    public static void main(String[] args) {

        Map<String, Double> carrosPopulares = new HashMap<>();
        carrosPopulares.put("gol", 14.4);
        carrosPopulares.put("uno", 15.6);
        carrosPopulares.put("mobi", 16.1);
        carrosPopulares.put("hb20", 14.5);
        carrosPopulares.put("kwid", 15.6);

        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>();
        carrosPopulares2.put("gol", 14.4);
        carrosPopulares2.put("uno", 15.6);
        carrosPopulares2.put("mobi", 16.1);
        carrosPopulares2.put("hb20", 14.5);
        carrosPopulares2.put("kwid", 15.6);

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15.2: ");
        carrosPopulares.put("gol", 15.2);

        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson está dentro do dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        // System.out.println("Exiba o terceiro modelo adicionado: ");

        System.out.println("Exiba os modelos: " + carrosPopulares.keySet());

        System.out.println("Exiba o consumo dos carros: " + carrosPopulares.values());
        
        Double maisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente;

        for (Map.Entry<String, Double> entry:
             entries) {
            if (entry.getValue().equals(maisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Exiba o modelo mais econômico e seu consumo: " + modeloMaisEficiente + " - " + Collections.max(carrosPopulares.values()));
            }
        }

        Double menosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        String modeloMenosEficiente;

        for (Map.Entry<String, Double> entry:
                entries2) {
            if (entry.getValue().equals(menosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Exiba o modelo menos econômico e seu consumo: " + modeloMenosEficiente + " - " + Collections.min(carrosPopulares.values()));
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos: " + (soma / carrosPopulares.size()));

        System.out.println("Remova os modelos com consumo igual a 15.6");
        carrosPopulares.values().removeIf(next -> next == 15.6);
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        System.out.println(carrosPopulares2);

        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares);
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        System.out.println(carrosPopulares3);

        System.out.println("Apague o conjunto de carros");
        carrosPopulares.clear();
        System.out.println("Confira se a lista está vazia: " + carrosPopulares.isEmpty());

    }

}
