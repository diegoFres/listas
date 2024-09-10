package listas;

import java.util.*;

public class listas {


    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        // Combina las dos listas
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }
        // Añade los elementos restantes
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }
        return result;
    }
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ingresa las 2 listas separando los numeros por coma");
            return;
        }

        List<Integer> list1 = convertir(args[0]);
        List<Integer> list2 = convertir(args[1]);

        // llama metodo merge
        List<Integer> listaCombinada = merge(list1, list2);
        System.out.println("Lista combinada: " + listaCombinada);
    }
    // convertir argumentos en lista numero entero
    private static List<Integer> convertir(String input) {
        String[] items = input.split(",");
        List<Integer> lista = new ArrayList<>();
        for (String item : items) {
            lista.add(Integer.parseInt(item.trim()));
        }
        return lista;
    }
}